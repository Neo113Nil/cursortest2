package com.blaze.blazesdk.features.videos.widgets.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.e;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import defpackage.a70;
import defpackage.cql;
import defpackage.fnm;
import defpackage.fsl;
import defpackage.ix1;
import defpackage.lcm;
import defpackage.lm5;
import defpackage.qom;
import defpackage.som;
import defpackage.w2g;
import defpackage.x5m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0095\u0001\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020'H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020'2\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b.\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u00104R\u0014\u0010\"\u001a\u00020<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lcom/blaze/blazesdk/features/videos/widgets/base/BlazeBaseVideosWidget;", "Lcom/blaze/blazesdk/widgets/ui/BlazeBaseWidget;", "Lcom/blaze/blazesdk/features/videos/models/ui/VideoModel;", "Lsom;", "Lcom/blaze/blazesdk/features/videos/widgets/WidgetVideosContract;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "widgetLayout", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachingLevel", "", "widgetId", "widgetRemoteId", "", "shouldOrderWidgetByReadStatus", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "widgetDelegate", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "perItemStyleOverrides", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "playbackConfiguration", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "onWidgetItemClickHandler", "", "initWidget", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Ljava/lang/String;ZLcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;Ljava/util/Map;Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;Lkotlin/jvm/functions/Function1;)V", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "videosAdsConfigType", "updateAdsConfigType", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;)V", "play", "()V", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "from", "(Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;)V", "getCurrentPlayerStyle", "()Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "updatePlayerStyle", "(Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;)V", "getCurrentPlaybackConfiguration", "()Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;)V", "getPlayerStyle", "Lcom/blaze/blazesdk/features/videos/models/ui/i;", "getPlaybackConfiguration", "()Lcom/blaze/blazesdk/features/videos/models/ui/i;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeBaseVideosWidget extends BlazeBaseWidget<VideoModel, som> implements WidgetVideosContract {
    public static final /* synthetic */ int s = 0;
    public BlazeVideosAdsConfigType r;

    public /* synthetic */ BlazeBaseVideosWidget(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void initWidget$default(BlazeBaseVideosWidget blazeBaseVideosWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: initWidget");
            return;
        }
        if ((i & 2) != 0) {
            blazeVideosPlayerStyle = null;
        }
        if ((i & 8) != 0) {
            blazeCachingLevel = BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release();
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            z = true;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            map = lm5.a;
            map.getClass();
        }
        if ((i & 512) != 0) {
            blazeVideosPlaybackConfiguration = null;
        }
        if ((i & 1024) != 0) {
            function1 = null;
        }
        blazeBaseVideosWidget.initWidget(blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, blazeVideosPlaybackConfiguration, function1);
    }

    public static final void m(BlazeBaseVideosWidget blazeBaseVideosWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1) {
        blazeBaseVideosWidget.g(str, som.class);
        som viewModel = blazeBaseVideosWidget.getViewModel();
        BlazeWidgetLayout blazeWidgetLayout2 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetLayout);
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = blazeVideosPlayerStyle != null ? (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeVideosPlayerStyle) : null;
        LinkedHashMap c = BlazeBaseWidget.c(map);
        i iVar = blazeVideosPlaybackConfiguration != null ? new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip()) : null;
        viewModel.getClass();
        blazeWidgetLayout2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeWidgetDelegate.getClass();
        viewModel.i(str, str2, blazeDataSourceType, blazeCachingLevel, blazeWidgetDelegate, z, c, function1, blazeWidgetLayout2);
        viewModel.r = blazeVideosPlayerStyle2;
        viewModel.s = iVar;
        if (viewModel.t == null) {
            viewModel.t = x5m.safeViewModelScopeIO$default(viewModel, null, new fnm(viewModel, null), 1, null);
        }
        if (viewModel.u == null) {
            viewModel.u = x5m.safeViewModelScopeIO$default(viewModel, null, new lcm(viewModel, null), 1, null);
        }
        if (w2g.a(viewModel.z()) != null) {
            viewModel.j(false);
        } else {
            boolean hasDataSourceChanged$default = fsl.hasDataSourceChanged$default(viewModel.q, viewModel.w(), viewModel.v(), viewModel.m, viewModel.w(), null, null, 48, null);
            cql.a aVar = (cql.a) viewModel.d.d();
            if (hasDataSourceChanged$default) {
                viewModel.j(false);
            } else if (aVar instanceof cql.a.b) {
                qom qomVar = viewModel.q;
                String w = viewModel.w();
                qomVar.getClass();
                List l = qom.l(w);
                if (l.isEmpty()) {
                    viewModel.j(false);
                } else {
                    viewModel.m(l);
                }
            } else if (aVar instanceof cql.a.c) {
                viewModel.m(((cql.a.c) aVar).b);
            }
        }
        blazeBaseVideosWidget.l();
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    public final void f(String str, F f) {
        str.getClass();
        f.getClass();
        B b = new B(f, null, null, null, null, null, 62, null);
        BlazeCachingLevel o = getViewModel().o();
        com.blaze.blazesdk.features.videos.models.args.a aVar = new com.blaze.blazesdk.features.videos.models.args.a(new a.e(getPlayerStyle(), new a.d.C0014a(e.a)), getViewModel().w(), getViewModel().w(), getViewModel().v().getAnalyticsLabelExpressionRepresentation$blazesdk_release(), getWidgetType(), b, this.r, str, false, o, false, false, false, null, getPlaybackConfiguration(), 15616, null);
        VideosPlayerActivity.a aVar2 = VideosPlayerActivity.u;
        Context context = getContext();
        context.getClass();
        aVar2.getClass();
        VideosPlayerActivity.a.b(context, aVar);
    }

    @Override // com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract
    @Keep
    @Nullable
    public BlazeVideosPlaybackConfiguration getCurrentPlaybackConfiguration() {
        if (this.viewModel == null) {
            return null;
        }
        i playbackConfiguration = getPlaybackConfiguration();
        playbackConfiguration.getClass();
        return new BlazeVideosPlaybackConfiguration(playbackConfiguration.a, playbackConfiguration.b, playbackConfiguration.c);
    }

    @Override // com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract
    @Keep
    @Nullable
    public BlazeVideosPlayerStyle getCurrentPlayerStyle() {
        if (this.viewModel != null) {
            return (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(getPlayerStyle());
        }
        return null;
    }

    @NotNull
    public final i getPlaybackConfiguration() {
        i iVar = getViewModel().s;
        if (iVar != null) {
            return iVar;
        }
        BlazeVideosPlaybackConfiguration defaultVideosPlaybackConfiguration = BlazeSDK.INSTANCE.getDefaultVideosPlaybackConfiguration();
        defaultVideosPlaybackConfiguration.getClass();
        return new i(defaultVideosPlaybackConfiguration.getMultiAspectRatio(), defaultVideosPlaybackConfiguration.getShouldOpenOnLandscape(), defaultVideosPlaybackConfiguration.getPip());
    }

    @NotNull
    public final BlazeVideosPlayerStyle getPlayerStyle() {
        BlazeVideosPlayerStyle blazeVideosPlayerStyle = getViewModel().r;
        return blazeVideosPlayerStyle == null ? BlazeSDK.INSTANCE.getDefaultVideosPlayerStyle() : blazeVideosPlayerStyle;
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout widgetLayout, @Nullable BlazeVideosPlayerStyle playerStyle, @NotNull BlazeDataSourceType dataSource, @NotNull BlazeCachingLevel cachingLevel, @NotNull String widgetId, @Nullable String widgetRemoteId, boolean shouldOrderWidgetByReadStatus, @NotNull BlazeWidgetDelegate widgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, @Nullable BlazeVideosPlaybackConfiguration playbackConfiguration, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> onWidgetItemClickHandler) {
        widgetLayout.getClass();
        dataSource.getClass();
        cachingLevel.getClass();
        widgetId.getClass();
        widgetDelegate.getClass();
        perItemStyleOverrides.getClass();
        if (isAttachedToWindow()) {
            m(this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, shouldOrderWidgetByReadStatus, widgetDelegate, perItemStyleOverrides, playbackConfiguration, onWidgetItemClickHandler);
        } else {
            addOnAttachStateChangeListener(new a(this, this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, shouldOrderWidgetByReadStatus, widgetDelegate, perItemStyleOverrides, playbackConfiguration, onWidgetItemClickHandler));
        }
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play(@NotNull BlazeWidgetPlayFrom from) {
        from.getClass();
        h(new ix1(8, from, this));
    }

    @Override // com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract
    @Keep
    public void updateAdsConfigType(@NotNull BlazeVideosAdsConfigType videosAdsConfigType) {
        videosAdsConfigType.getClass();
        this.r = videosAdsConfigType;
    }

    @Override // com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract
    @Keep
    public void updatePlaybackConfiguration(@Nullable BlazeVideosPlaybackConfiguration playbackConfiguration) {
        h(new ix1(6, this, playbackConfiguration));
    }

    @Override // com.blaze.blazesdk.features.videos.widgets.WidgetVideosContract
    @Keep
    public void updatePlayerStyle(@NotNull BlazeVideosPlayerStyle playerStyle) {
        playerStyle.getClass();
        h(new ix1(7, this, playerStyle));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play() {
        play(new BlazeWidgetPlayFrom.Index(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseVideosWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseVideosWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseVideosWidget(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseVideosWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.r = BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ BlazeBaseVideosWidget b;
        public final /* synthetic */ BlazeWidgetLayout c;
        public final /* synthetic */ BlazeVideosPlayerStyle d;
        public final /* synthetic */ BlazeDataSourceType e;
        public final /* synthetic */ BlazeCachingLevel f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ BlazeWidgetDelegate j;
        public final /* synthetic */ Map k;
        public final /* synthetic */ BlazeVideosPlaybackConfiguration l;
        public final /* synthetic */ Function1 m;

        public a(View view, BlazeBaseVideosWidget blazeBaseVideosWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeVideosPlayerStyle blazeVideosPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1) {
            this.a = view;
            this.b = blazeBaseVideosWidget;
            this.c = blazeWidgetLayout;
            this.d = blazeVideosPlayerStyle;
            this.e = blazeDataSourceType;
            this.f = blazeCachingLevel;
            this.g = str;
            this.h = str2;
            this.i = z;
            this.j = blazeWidgetDelegate;
            this.k = map;
            this.l = blazeVideosPlaybackConfiguration;
            this.m = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            BlazeBaseVideosWidget.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, null, false, blazeWidgetDelegate, null, null, null, 1888, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, false, blazeWidgetDelegate, null, null, null, 1856, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, null, null, null, 1792, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, null, null, 1536, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, blazeVideosPlaybackConfiguration, null, 1024, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeVideosPlayerStyle blazeVideosPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeVideosPlayerStyle, blazeDataSourceType, null, str, null, false, blazeWidgetDelegate, null, null, null, 1896, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, null, blazeDataSourceType, null, str, null, false, blazeWidgetDelegate, null, null, null, 1898, null);
    }
}
