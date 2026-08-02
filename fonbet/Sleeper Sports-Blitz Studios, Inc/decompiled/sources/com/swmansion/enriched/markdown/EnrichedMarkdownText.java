package com.swmansion.enriched.markdown;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.enriched.markdown.events.LinkPressEvent;
import com.swmansion.enriched.markdown.parser.MarkdownASTNode;
import com.swmansion.enriched.markdown.parser.Parser;
import com.swmansion.enriched.markdown.renderer.Renderer;
import com.swmansion.enriched.markdown.spans.ImageSpan;
import com.swmansion.enriched.markdown.styles.StyleConfig;
import com.swmansion.enriched.markdown.utils.SelectionActionModeKt;
import io.sentry.Session;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrichedMarkdownText.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0010J\u0010\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)J\b\u0010*\u001a\u00020\u0011H\u0002J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0002J\u000e\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0010J\u001a\u00103\u001a\u00020\u00112\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00066"}, d2 = {"Lcom/swmansion/enriched/markdown/EnrichedMarkdownText;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "parser", "Lcom/swmansion/enriched/markdown/parser/Parser;", "renderer", "Lcom/swmansion/enriched/markdown/renderer/Renderer;", "onLinkPressCallback", "Lkotlin/Function1;", "", "", "mainHandler", "Landroid/os/Handler;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "currentRenderId", "", "layoutManager", "Lcom/swmansion/enriched/markdown/EnrichedMarkdownTextLayoutManager;", "getLayoutManager", "()Lcom/swmansion/enriched/markdown/EnrichedMarkdownTextLayoutManager;", "value", "Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "markdownStyle", "getMarkdownStyle", "()Lcom/swmansion/enriched/markdown/styles/StyleConfig;", "currentMarkdown", "getCurrentMarkdown", "()Ljava/lang/String;", "setMarkdownContent", "markdown", "setMarkdownStyle", "style", "Lcom/facebook/react/bridge/ReadableMap;", "scheduleRender", "applyRenderedText", "styledText", "", "setIsSelectable", "selectable", "", "emitOnLinkPress", "url", "setOnLinkPressCallback", "callback", "Companion", "react-native-enriched-markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EnrichedMarkdownText extends AppCompatTextView {
    private static final String TAG = "EnrichedMarkdownMeasure";
    private String currentMarkdown;
    private long currentRenderId;
    private final ExecutorService executor;
    private final EnrichedMarkdownTextLayoutManager layoutManager;
    private final Handler mainHandler;
    private StyleConfig markdownStyle;
    private Function1<? super String, Unit> onLinkPressCallback;
    private final Parser parser;
    private final Renderer renderer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnrichedMarkdownText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnrichedMarkdownText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EnrichedMarkdownText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnrichedMarkdownText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.parser = Parser.INSTANCE.getShared();
        this.renderer = new Renderer();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.executor = Executors.newSingleThreadExecutor();
        this.layoutManager = new EnrichedMarkdownTextLayoutManager(this);
        this.currentMarkdown = "";
        setBackgroundColor(0);
        setIncludeFontPadding(false);
        setMovementMethod(LinkMovementMethod.getInstance());
        setTextIsSelectable(true);
        setCustomSelectionActionModeCallback(SelectionActionModeKt.createSelectionActionModeCallback(this));
    }

    public final EnrichedMarkdownTextLayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    public final StyleConfig getMarkdownStyle() {
        return this.markdownStyle;
    }

    public final String getCurrentMarkdown() {
        return this.currentMarkdown;
    }

    public final void setMarkdownContent(String markdown) {
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        if (Intrinsics.areEqual(this.currentMarkdown, markdown)) {
            return;
        }
        this.currentMarkdown = markdown;
        scheduleRender();
    }

    public final void setMarkdownStyle(ReadableMap style) {
        StyleConfig styleConfig;
        if (style != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            styleConfig = new StyleConfig(style, context);
        } else {
            styleConfig = null;
        }
        if (Intrinsics.areEqual(this.markdownStyle, styleConfig)) {
            return;
        }
        this.markdownStyle = styleConfig;
        scheduleRender();
    }

    private final void scheduleRender() {
        final StyleConfig styleConfig = this.markdownStyle;
        if (styleConfig == null) {
            return;
        }
        final String str = this.currentMarkdown;
        final long j = 1 + this.currentRenderId;
        this.currentRenderId = j;
        final long currentTimeMillis = System.currentTimeMillis();
        this.executor.execute(new Runnable() { // from class: com.swmansion.enriched.markdown.EnrichedMarkdownText$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EnrichedMarkdownText.scheduleRender$lambda$5(EnrichedMarkdownText.this, str, styleConfig, j, currentTimeMillis);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRender$lambda$5(final EnrichedMarkdownText enrichedMarkdownText, String str, StyleConfig styleConfig, final long j, final long j2) {
        final long j3 = j;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            MarkdownASTNode parseMarkdown = enrichedMarkdownText.parser.parseMarkdown(str);
            if (parseMarkdown == null) {
                enrichedMarkdownText.mainHandler.post(new Runnable() { // from class: com.swmansion.enriched.markdown.EnrichedMarkdownText$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnrichedMarkdownText.scheduleRender$lambda$5$lambda$2$lambda$1(j3, enrichedMarkdownText);
                    }
                });
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            long currentTimeMillis3 = System.currentTimeMillis();
            Renderer renderer = enrichedMarkdownText.renderer;
            Context context = enrichedMarkdownText.getContext();
            try {
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                renderer.configure(styleConfig, context);
                final SpannableString renderDocument = enrichedMarkdownText.renderer.renderDocument(parseMarkdown, enrichedMarkdownText.onLinkPressCallback);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                Log.i(TAG, "┌──────────────────────────────────────────────");
                Log.i(TAG, "│ 📝 Input: " + str.length() + " chars of Markdown");
                Log.i(TAG, "│ ⚡ md4c (C++ native): " + currentTimeMillis2 + "ms → " + parseMarkdown.getChildren().size() + " AST nodes");
                Log.i(TAG, "│ 🎨 Spannable render: " + currentTimeMillis4 + "ms → " + renderDocument.length() + " styled chars");
                Log.i(TAG, "└──────────────────────────────────────────────");
                enrichedMarkdownText.mainHandler.post(new Runnable() { // from class: com.swmansion.enriched.markdown.EnrichedMarkdownText$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnrichedMarkdownText.scheduleRender$lambda$5$lambda$3(j, enrichedMarkdownText, renderDocument, j2);
                    }
                });
            } catch (Exception e) {
                e = e;
                j3 = j;
                Log.e(TAG, "❌ Render failed: " + e.getMessage(), e);
                enrichedMarkdownText.mainHandler.post(new Runnable() { // from class: com.swmansion.enriched.markdown.EnrichedMarkdownText$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EnrichedMarkdownText.scheduleRender$lambda$5$lambda$4(j3, enrichedMarkdownText);
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRender$lambda$5$lambda$2$lambda$1(long j, EnrichedMarkdownText enrichedMarkdownText) {
        if (j == enrichedMarkdownText.currentRenderId) {
            enrichedMarkdownText.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRender$lambda$5$lambda$3(long j, EnrichedMarkdownText enrichedMarkdownText, SpannableString spannableString, long j2) {
        if (j == enrichedMarkdownText.currentRenderId) {
            enrichedMarkdownText.applyRenderedText(spannableString);
            Log.i(TAG, "✅ Total time to display: " + (System.currentTimeMillis() - j2) + "ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleRender$lambda$5$lambda$4(long j, EnrichedMarkdownText enrichedMarkdownText) {
        if (j == enrichedMarkdownText.currentRenderId) {
            enrichedMarkdownText.setText("");
        }
    }

    private final void applyRenderedText(CharSequence styledText) {
        setText(styledText);
        if (!(getMovementMethod() instanceof LinkMovementMethod)) {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        Iterator<T> it = this.renderer.getCollectedImageSpans().iterator();
        while (it.hasNext()) {
            ((ImageSpan) it.next()).registerTextView(this);
        }
        this.layoutManager.invalidateLayout();
    }

    public final void setIsSelectable(boolean selectable) {
        if (isTextSelectable() == selectable) {
            return;
        }
        setTextIsSelectable(selectable);
        setMovementMethod(LinkMovementMethod.getInstance());
        if (selectable || isClickable()) {
            return;
        }
        setClickable(true);
    }

    public final void emitOnLinkPress(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null) {
            return;
        }
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new LinkPressEvent(surfaceId, getId(), url));
        }
    }

    public final void setOnLinkPressCallback(Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onLinkPressCallback = callback;
    }
}
