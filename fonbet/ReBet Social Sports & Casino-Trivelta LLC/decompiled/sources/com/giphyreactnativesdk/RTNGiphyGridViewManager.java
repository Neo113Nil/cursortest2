package com.giphyreactnativesdk;

import V8.A;
import V8.InterfaceC1729j;
import X8.f;
import Z8.a;
import a9.C1925b;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.views.GifView;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = RTNGiphyGridViewManager.NAME)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001f\u0010\u0018J#\u0010 \u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b \u0010\u0018J!\u0010!\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u001cH\u0017¢\u0006\u0004\b!\u0010\u001eJ#\u0010\"\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\"\u0010\u0018J#\u0010#\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b#\u0010\u0018J!\u0010$\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0019H\u0017¢\u0006\u0004\b$\u0010\u001bJ!\u0010%\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u001cH\u0017¢\u0006\u0004\b%\u0010\u001eJ\u001b\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102¨\u00066"}, d2 = {"Lcom/giphyreactnativesdk/RTNGiphyGridViewManager;", "Lcom/giphyreactnativesdk/RTNGiphyGridViewManagerSpec;", "LX8/f;", "<init>", "()V", "view", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "LV8/j;", "getGridCallback", "(LX8/f;Lcom/facebook/react/uimanager/ThemedReactContext;)LV8/j;", "LV8/A;", "getSearchGridCallback", "(LX8/f;Lcom/facebook/react/uimanager/ThemedReactContext;)LV8/A;", "", "getName", "()Ljava/lang/String;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)LX8/f;", "", "onDropViewInstance", "(LX8/f;)V", EventKeys.VALUE_KEY, "setTheme", "(LX8/f;Ljava/lang/String;)V", "", "setSpanCount", "(LX8/f;I)V", "", "setShowCheckeredBackground", "(LX8/f;Z)V", "setRenditionType", "setOrientation", "setFixedSizeCells", "setContent", "setClipsPreviewRenditionType", "setCellPadding", "setDisableEmojiVariations", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "eventName", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(Ljava/lang/Integer;)V", "Lcom/giphy/sdk/core/models/enums/RenditionType;", "_renditionType", "Lcom/giphy/sdk/core/models/enums/RenditionType;", "_clipsPreviewRenditionType", "Companion", "a", "giphy_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTNGiphyGridViewManager extends RTNGiphyGridViewManagerSpec<f> {

    @NotNull
    public static final String NAME = "RTNGiphyGridView";

    @NotNull
    private RenditionType _clipsPreviewRenditionType;

    @NotNull
    private RenditionType _renditionType;

    public static final class b implements InterfaceC1729j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31864a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ThemedReactContext f31865b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RTNGiphyGridViewManager f31866c;

        public b(f fVar, ThemedReactContext themedReactContext, RTNGiphyGridViewManager rTNGiphyGridViewManager) {
            this.f31864a = fVar;
            this.f31865b = themedReactContext;
            this.f31866c = rTNGiphyGridViewManager;
        }

        @Override // V8.InterfaceC1729j
        public void a(Media media) {
            Intrinsics.checkNotNullParameter(media, "media");
            Z8.b bVar = new Z8.b(UIManagerHelper.getSurfaceId(this.f31864a), this.f31864a.getId(), media, media.getType() == MediaType.video ? this.f31866c._clipsPreviewRenditionType : this.f31866c._renditionType);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f31865b, this.f31864a.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(bVar);
            }
        }

        @Override // V8.InterfaceC1729j
        public void b(int i10) {
            a aVar = new a(UIManagerHelper.getSurfaceId(this.f31864a), this.f31864a.getId(), i10);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f31865b, this.f31864a.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(aVar);
            }
        }
    }

    public static final class c implements A {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31867a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ThemedReactContext f31868b;

        public c(f fVar, ThemedReactContext themedReactContext) {
            this.f31867a = fVar;
            this.f31868b = themedReactContext;
        }

        @Override // V8.A
        public void a(int i10, int i11) {
            Z8.c cVar = new Z8.c(UIManagerHelper.getSurfaceId(this.f31867a), this.f31867a.getId(), i11);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f31868b, this.f31867a.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(cVar);
            }
        }

        @Override // V8.A
        public void b(GifView cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
        }

        @Override // V8.A
        public void c(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
        }
    }

    public RTNGiphyGridViewManager() {
        RenditionType renditionType = RenditionType.downsized;
        this._renditionType = renditionType;
        this._clipsPreviewRenditionType = renditionType;
    }

    private final InterfaceC1729j getGridCallback(f view, ThemedReactContext context) {
        return new b(view, context, this);
    }

    private final A getSearchGridCallback(f view, ThemedReactContext context) {
        return new c(view, context);
    }

    @ReactMethod
    public final void addListener(@Nullable String eventName) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topContentUpdate", MapBuilder.of("registrationName", "onContentUpdate"));
        exportedCustomDirectEventTypeConstants.put("topMediaSelect", MapBuilder.of("registrationName", "onMediaSelect"));
        exportedCustomDirectEventTypeConstants.put("topScroll", MapBuilder.of("registrationName", "onScroll"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void removeListeners(@Nullable Integer count) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public f createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f fVar = new f(context, null, 0, 6, null);
        fVar.getGridView().setCallback(getGridCallback(fVar, context));
        fVar.getGridView().setSearchCallback(getSearchGridCallback(fVar, context));
        return fVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull f view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.c();
        super.onDropViewInstance((RTNGiphyGridViewManager) view);
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "cellPadding")
    public void setCellPadding(@Nullable f view, int value) {
        if (view != null) {
            view.setCellPadding(Integer.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "clipsPreviewRenditionType")
    public void setClipsPreviewRenditionType(@Nullable f view, @Nullable String value) {
        if (view != null) {
            view.setClipsPreviewRenditionType(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "content")
    public void setContent(@Nullable f view, @Nullable String value) {
        if (value == null || value.length() == 0) {
            if (view != null) {
                view.setContent(null);
            }
        } else if (view != null) {
            view.setContent(C1925b.f15106a.c(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "disableEmojiVariations")
    public void setDisableEmojiVariations(@Nullable f view, boolean value) {
        if (view != null) {
            view.setDisableEmojiVariations(Boolean.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "fixedSizeCells")
    public void setFixedSizeCells(@Nullable f view, boolean value) {
        if (view != null) {
            view.setFixedSizeCells(Boolean.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "orientation")
    public void setOrientation(@Nullable f view, @Nullable String value) {
        if (view != null) {
            view.setOrientation(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "renditionType")
    public void setRenditionType(@Nullable f view, @Nullable String value) {
        if (view != null) {
            view.setRenditionType(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "showCheckeredBackground")
    public void setShowCheckeredBackground(@Nullable f view, boolean value) {
        if (view != null) {
            view.setShowCheckeredBackground(Boolean.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "spanCount")
    public void setSpanCount(@Nullable f view, int value) {
        if (view != null) {
            view.setSpanCount(Integer.valueOf(value));
        }
    }

    @Override // com.facebook.react.viewmanagers.RTNGiphyGridViewManagerInterface
    @ReactProp(name = "theme")
    public void setTheme(@Nullable f view, @Nullable String value) {
        if (value == null || value.length() == 0) {
            if (view != null) {
                view.setTheme(null);
            }
        } else if (view != null) {
            view.setTheme(C1925b.f15106a.c(value));
        }
    }
}
