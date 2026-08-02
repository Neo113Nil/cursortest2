package com.blaze.blazesdk.features.stories.widgets.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.players.ui.StoriesPlayerActivity;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.features.stories.widgets.WidgetStoriesContract;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import defpackage.a70;
import defpackage.cql;
import defpackage.gcm;
import defpackage.ix1;
import defpackage.lm5;
import defpackage.lom;
import defpackage.w2g;
import defpackage.x5m;
import defpackage.ymm;
import defpackage.yrl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0089\u0001\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0017¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0017¢\u0006\u0004\b,\u00100J\u0011\u00101\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00102¨\u00066"}, d2 = {"Lcom/blaze/blazesdk/features/stories/widgets/base/BlazeBaseStoryWidget;", "Lcom/blaze/blazesdk/widgets/ui/BlazeBaseWidget;", "Lcom/blaze/blazesdk/features/stories/models/ui/StoryModel;", "Llom;", "Lcom/blaze/blazesdk/features/stories/widgets/WidgetStoriesContract;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "widgetLayout", "Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachingLevel", "", "widgetId", "widgetRemoteId", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "widgetDelegate", "", "shouldOrderWidgetByReadStatus", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "perItemStyleOverrides", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "onWidgetItemClickHandler", "", "initWidget", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;ZLjava/util/Map;Lkotlin/jvm/functions/Function1;)V", "Lcom/blaze/blazesdk/ads/models/ui/BlazeStoriesAdsConfigType;", "storiesAdsConfigType", "updateAdsConfigType", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeStoriesAdsConfigType;)V", "play", "()V", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "from", "(Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;)V", "getCurrentPlayerStyle", "()Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;", "updatePlayerStyle", "(Lcom/blaze/blazesdk/style/players/stories/BlazeStoryPlayerStyle;)V", "getPlayerStyle", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeBaseStoryWidget extends BlazeBaseWidget<StoryModel, lom> implements WidgetStoriesContract {
    public static final /* synthetic */ int s = 0;
    public BlazeStoriesAdsConfigType r;

    public /* synthetic */ BlazeBaseStoryWidget(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void initWidget$default(BlazeBaseStoryWidget blazeBaseStoryWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeStoryPlayerStyle blazeStoryPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, BlazeWidgetDelegate blazeWidgetDelegate, boolean z, Map map, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: initWidget");
            return;
        }
        if ((i & 2) != 0) {
            blazeStoryPlayerStyle = null;
        }
        if ((i & 8) != 0) {
            blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            z = true;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            map = lm5.a;
            map.getClass();
        }
        if ((i & 512) != 0) {
            function1 = null;
        }
        blazeBaseStoryWidget.initWidget(blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, blazeWidgetDelegate, z, map, function1);
    }

    public static final void m(BlazeBaseStoryWidget blazeBaseStoryWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeStoryPlayerStyle blazeStoryPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, BlazeWidgetDelegate blazeWidgetDelegate, boolean z, Map map, Function1 function1) {
        blazeBaseStoryWidget.g(str, lom.class);
        lom viewModel = blazeBaseStoryWidget.getViewModel();
        BlazeWidgetLayout blazeWidgetLayout2 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetLayout);
        BlazeStoryPlayerStyle blazeStoryPlayerStyle2 = blazeStoryPlayerStyle != null ? (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeStoryPlayerStyle) : null;
        LinkedHashMap c = BlazeBaseWidget.c(map);
        viewModel.getClass();
        blazeWidgetLayout2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        viewModel.i(str, str2, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, z, c, function1, blazeWidgetLayout2);
        viewModel.q = blazeStoryPlayerStyle2;
        if (viewModel.r == null) {
            viewModel.r = x5m.safeViewModelScopeIO$default(viewModel, null, new ymm(viewModel, null), 1, null);
        }
        if (viewModel.s == null) {
            viewModel.s = x5m.safeViewModelScopeIO$default(viewModel, null, new gcm(viewModel, null), 1, null);
        }
        if (w2g.a(viewModel.z()) != null) {
            viewModel.j(false);
        } else {
            cql.a aVar = (cql.a) viewModel.d.d();
            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
            if (yrl.hasDataSourceChanged$default(storiesRepositoryImpl, viewModel.w(), viewModel.v(), viewModel.m, viewModel.w(), null, null, 48, null)) {
                viewModel.j(false);
            } else if (aVar instanceof cql.a.b) {
                String w = viewModel.w();
                storiesRepositoryImpl.getClass();
                List o = StoriesRepositoryImpl.o(w);
                if (o.isEmpty()) {
                    viewModel.j(false);
                } else {
                    viewModel.m(o);
                }
            } else if (aVar instanceof cql.a.c) {
                viewModel.m(((cql.a.c) aVar).b);
            }
        }
        blazeBaseStoryWidget.l();
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    public final void f(String str, F f) {
        str.getClass();
        f.getClass();
        B b = new B(f, null, null, null, null, null, 62, null);
        BlazeCachingLevel o = getViewModel().o();
        com.blaze.blazesdk.features.stories.models.args.a aVar = new com.blaze.blazesdk.features.stories.models.args.a(getPlayerStyle(), getViewModel().w(), getViewModel().w(), getViewModel().v().getAnalyticsLabelExpressionRepresentation$blazesdk_release(), getWidgetType(), b, this.r, str, null, false, o, false, null, 6912, null);
        StoriesPlayerActivity.a aVar2 = StoriesPlayerActivity.n;
        Context context = getContext();
        context.getClass();
        aVar2.getClass();
        StoriesPlayerActivity.a.a(context, aVar);
    }

    @Override // com.blaze.blazesdk.features.stories.widgets.WidgetStoriesContract
    @Keep
    @Nullable
    public BlazeStoryPlayerStyle getCurrentPlayerStyle() {
        if (this.viewModel != null) {
            return (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(getPlayerStyle());
        }
        return null;
    }

    @NotNull
    public final BlazeStoryPlayerStyle getPlayerStyle() {
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = getViewModel().q;
        return blazeStoryPlayerStyle == null ? BlazeSDK.INSTANCE.getDefaultStoryPlayerStyle() : blazeStoryPlayerStyle;
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout widgetLayout, @Nullable BlazeStoryPlayerStyle playerStyle, @NotNull BlazeDataSourceType dataSource, @NotNull BlazeCachingLevel cachingLevel, @NotNull String widgetId, @Nullable String widgetRemoteId, @NotNull BlazeWidgetDelegate widgetDelegate, boolean shouldOrderWidgetByReadStatus, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> onWidgetItemClickHandler) {
        widgetLayout.getClass();
        dataSource.getClass();
        cachingLevel.getClass();
        widgetId.getClass();
        widgetDelegate.getClass();
        perItemStyleOverrides.getClass();
        if (isAttachedToWindow()) {
            m(this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, widgetDelegate, shouldOrderWidgetByReadStatus, perItemStyleOverrides, onWidgetItemClickHandler);
        } else {
            addOnAttachStateChangeListener(new a(this, this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, widgetDelegate, shouldOrderWidgetByReadStatus, perItemStyleOverrides, onWidgetItemClickHandler));
        }
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play(@NotNull BlazeWidgetPlayFrom from) {
        from.getClass();
        h(new ix1(4, from, this));
    }

    @Override // com.blaze.blazesdk.features.stories.widgets.WidgetStoriesContract
    @Keep
    public void updateAdsConfigType(@NotNull BlazeStoriesAdsConfigType storiesAdsConfigType) {
        storiesAdsConfigType.getClass();
        this.r = storiesAdsConfigType;
    }

    @Override // com.blaze.blazesdk.features.stories.widgets.WidgetStoriesContract
    @Keep
    public void updatePlayerStyle(@NotNull BlazeStoryPlayerStyle playerStyle) {
        playerStyle.getClass();
        h(new ix1(5, this, playerStyle));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play() {
        play(new BlazeWidgetPlayFrom.Index(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseStoryWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseStoryWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseStoryWidget(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseStoryWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.r = BlazeStoriesAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ BlazeBaseStoryWidget b;
        public final /* synthetic */ BlazeWidgetLayout c;
        public final /* synthetic */ BlazeStoryPlayerStyle d;
        public final /* synthetic */ BlazeDataSourceType e;
        public final /* synthetic */ BlazeCachingLevel f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ BlazeWidgetDelegate i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ Map k;
        public final /* synthetic */ Function1 l;

        public a(View view, BlazeBaseStoryWidget blazeBaseStoryWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeStoryPlayerStyle blazeStoryPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, BlazeWidgetDelegate blazeWidgetDelegate, boolean z, Map map, Function1 function1) {
            this.a = view;
            this.b = blazeBaseStoryWidget;
            this.c = blazeWidgetLayout;
            this.d = blazeStoryPlayerStyle;
            this.e = blazeDataSourceType;
            this.f = blazeCachingLevel;
            this.g = str;
            this.h = str2;
            this.i = blazeWidgetDelegate;
            this.j = z;
            this.k = map;
            this.l = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            BlazeBaseStoryWidget.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, null, blazeWidgetDelegate, false, null, null, 928, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, blazeWidgetDelegate, false, null, null, 896, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, boolean z) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, blazeWidgetDelegate, z, null, null, 768, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, boolean z, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, blazeWidgetDelegate, z, map, null, 512, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeStoryPlayerStyle, blazeDataSourceType, null, str, null, blazeWidgetDelegate, false, null, null, 936, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, null, blazeDataSourceType, null, str, null, blazeWidgetDelegate, false, null, null, 938, null);
    }
}
