package com.blaze.blazesdk.features.moments.widgets.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.players.ui.MomentsPlayerActivity;
import com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.BlazeWidgetPlayFrom;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import defpackage.a70;
import defpackage.i2a;
import defpackage.ix1;
import defpackage.lm5;
import defpackage.qpm;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0095\u0001\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0018\u00010#H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020'H\u0017¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020'2\u0006\u00101\u001a\u000200H\u0017¢\u0006\u0004\b.\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020'2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00104R\u0014\u0010\"\u001a\u00020:8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/blaze/blazesdk/features/moments/widgets/base/BlazeBaseMomentsWidget;", "Lcom/blaze/blazesdk/widgets/ui/BlazeBaseWidget;", "Lcom/blaze/blazesdk/features/moments/models/ui/MomentModel;", "Lqpm;", "Lcom/blaze/blazesdk/features/moments/widgets/WidgetMomentsContract;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "widgetLayout", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "playerStyle", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSource", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "cachingLevel", "", "widgetId", "widgetRemoteId", "", "shouldOrderWidgetByReadStatus", "Lcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;", "widgetDelegate", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "perItemStyleOverrides", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;", "playbackConfiguration", "Lkotlin/Function1;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickParams;", "Lcom/blaze/blazesdk/delegates/models/BlazeWidgetItemClickHandlerState;", "onWidgetItemClickHandler", "", "initWidget", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Ljava/lang/String;Ljava/lang/String;ZLcom/blaze/blazesdk/delegates/BlazeWidgetDelegate;Ljava/util/Map;Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;Lkotlin/jvm/functions/Function1;)V", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "momentsAdsConfigType", "updateAdsConfigType", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;)V", "play", "()V", "Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;", "from", "(Lcom/blaze/blazesdk/widgets/models/BlazeWidgetPlayFrom;)V", "getCurrentPlayerStyle", "()Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;", "updatePlayerStyle", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerStyle;)V", "updatePlaybackConfiguration", "(Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsPlaybackConfiguration;)V", "getPlayerStyle", "Lcom/blaze/blazesdk/features/moments/models/ui/a;", "getPlaybackConfiguration", "()Lcom/blaze/blazesdk/features/moments/models/ui/a;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeBaseMomentsWidget extends BlazeBaseWidget<MomentModel, qpm> implements WidgetMomentsContract {
    public static final /* synthetic */ int s = 0;
    public BlazeMomentsAdsConfigType r;

    public /* synthetic */ BlazeBaseMomentsWidget(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void initWidget$default(BlazeBaseMomentsWidget blazeBaseMomentsWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, Function1 function1, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: initWidget");
            return;
        }
        if ((i & 2) != 0) {
            blazeMomentsPlayerStyle = null;
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
            blazeMomentsPlaybackConfiguration = null;
        }
        if ((i & 1024) != 0) {
            function1 = null;
        }
        blazeBaseMomentsWidget.initWidget(blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, blazeMomentsPlaybackConfiguration, function1);
    }

    public static final void m(BlazeBaseMomentsWidget blazeBaseMomentsWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, com.blaze.blazesdk.features.moments.models.ui.a aVar, Function1 function1) {
        blazeBaseMomentsWidget.g(str, qpm.class);
        blazeBaseMomentsWidget.getViewModel().B(str, str2, (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetLayout), blazeMomentsPlayerStyle != null ? (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle) : null, blazeDataSourceType, blazeCachingLevel, z, blazeWidgetDelegate, BlazeBaseWidget.c(map), function1, aVar);
        blazeBaseMomentsWidget.l();
    }

    @Override // com.blaze.blazesdk.widgets.ui.BlazeBaseWidget
    public final void f(String str, F f) {
        str.getClass();
        f.getClass();
        boolean z = false;
        com.blaze.blazesdk.features.moments.models.args.a aVar = new com.blaze.blazesdk.features.moments.models.args.a(getPlayerStyle(), getViewModel().w(), getViewModel().w(), getViewModel().v().getAnalyticsLabelExpressionRepresentation$blazesdk_release(), getWidgetType(), new B(f, null, null, null, null, null, 62, null), this.r, str, z, getViewModel().o(), false, false, null, getPlaybackConfiguration(), 7424, null);
        MomentsPlayerActivity.a aVar2 = MomentsPlayerActivity.n;
        Context context = getContext();
        context.getClass();
        aVar2.getClass();
        MomentsPlayerActivity.a.a(context, aVar);
    }

    @Override // com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract
    @Keep
    @Nullable
    public BlazeMomentsPlayerStyle getCurrentPlayerStyle() {
        if (this.viewModel != null) {
            return (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(getPlayerStyle());
        }
        return null;
    }

    @NotNull
    public final com.blaze.blazesdk.features.moments.models.ui.a getPlaybackConfiguration() {
        com.blaze.blazesdk.features.moments.models.ui.a aVar = getViewModel().r;
        return aVar == null ? i2a.p(BlazeSDK.INSTANCE.getDefaultMomentsPlaybackConfiguration()) : aVar;
    }

    @NotNull
    public final BlazeMomentsPlayerStyle getPlayerStyle() {
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = getViewModel().q;
        return blazeMomentsPlayerStyle == null ? BlazeSDK.INSTANCE.getDefaultMomentsPlayerStyle() : blazeMomentsPlayerStyle;
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout widgetLayout, @Nullable BlazeMomentsPlayerStyle playerStyle, @NotNull BlazeDataSourceType dataSource, @NotNull BlazeCachingLevel cachingLevel, @NotNull String widgetId, @Nullable String widgetRemoteId, boolean shouldOrderWidgetByReadStatus, @NotNull BlazeWidgetDelegate widgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, @Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration, @Nullable Function1<? super BlazeWidgetItemClickParams, ? extends BlazeWidgetItemClickHandlerState> onWidgetItemClickHandler) {
        widgetLayout.getClass();
        dataSource.getClass();
        cachingLevel.getClass();
        widgetId.getClass();
        widgetDelegate.getClass();
        perItemStyleOverrides.getClass();
        if (isAttachedToWindow()) {
            m(this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, shouldOrderWidgetByReadStatus, widgetDelegate, perItemStyleOverrides, playbackConfiguration != null ? new com.blaze.blazesdk.features.moments.models.ui.a(playbackConfiguration.getLoopBehavior()) : null, onWidgetItemClickHandler);
        } else {
            addOnAttachStateChangeListener(new a(this, this, widgetLayout, playerStyle, dataSource, cachingLevel, widgetId, widgetRemoteId, shouldOrderWidgetByReadStatus, widgetDelegate, perItemStyleOverrides, playbackConfiguration, onWidgetItemClickHandler));
        }
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play(@NotNull BlazeWidgetPlayFrom from) {
        from.getClass();
        h(new ix1(2, from, this));
    }

    @Override // com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract
    @Keep
    public void updateAdsConfigType(@NotNull BlazeMomentsAdsConfigType momentsAdsConfigType) {
        momentsAdsConfigType.getClass();
        this.r = momentsAdsConfigType;
    }

    @Override // com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract
    @Keep
    public void updatePlaybackConfiguration(@Nullable BlazeMomentsPlaybackConfiguration playbackConfiguration) {
        h(new ix1(1, this, playbackConfiguration));
    }

    @Override // com.blaze.blazesdk.features.moments.widgets.WidgetMomentsContract
    @Keep
    public void updatePlayerStyle(@NotNull BlazeMomentsPlayerStyle playerStyle) {
        playerStyle.getClass();
        h(new ix1(3, this, playerStyle));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void play() {
        play(new BlazeWidgetPlayFrom.Index(0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseMomentsWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseMomentsWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseMomentsWidget(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseMomentsWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.r = BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ BlazeBaseMomentsWidget b;
        public final /* synthetic */ BlazeWidgetLayout c;
        public final /* synthetic */ BlazeMomentsPlayerStyle d;
        public final /* synthetic */ BlazeDataSourceType e;
        public final /* synthetic */ BlazeCachingLevel f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ BlazeWidgetDelegate j;
        public final /* synthetic */ Map k;
        public final /* synthetic */ BlazeMomentsPlaybackConfiguration l;
        public final /* synthetic */ Function1 m;

        public a(View view, BlazeBaseMomentsWidget blazeBaseMomentsWidget, BlazeWidgetLayout blazeWidgetLayout, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, String str, String str2, boolean z, BlazeWidgetDelegate blazeWidgetDelegate, Map map, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, Function1 function1) {
            this.a = view;
            this.b = blazeBaseMomentsWidget;
            this.c = blazeWidgetLayout;
            this.d = blazeMomentsPlayerStyle;
            this.e = blazeDataSourceType;
            this.f = blazeCachingLevel;
            this.g = str;
            this.h = str2;
            this.i = z;
            this.j = blazeWidgetDelegate;
            this.k = map;
            this.l = blazeMomentsPlaybackConfiguration;
            this.m = function1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration = this.l;
            BlazeBaseMomentsWidget.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, blazeMomentsPlaybackConfiguration != null ? i2a.p(blazeMomentsPlaybackConfiguration) : null, this.m);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, null, false, blazeWidgetDelegate, null, null, null, 1888, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, false, blazeWidgetDelegate, null, null, null, 1856, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, null, null, null, 1792, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, null, null, 1536, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull String str, @Nullable String str2, boolean z, @NotNull BlazeWidgetDelegate blazeWidgetDelegate, @NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> map, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        map.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, blazeCachingLevel, str, str2, z, blazeWidgetDelegate, map, blazeMomentsPlaybackConfiguration, null, 1024, null);
    }

    @Keep
    public final void initWidget(@NotNull BlazeWidgetLayout blazeWidgetLayout, @Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull String str, @NotNull BlazeWidgetDelegate blazeWidgetDelegate) {
        blazeWidgetLayout.getClass();
        blazeDataSourceType.getClass();
        str.getClass();
        blazeWidgetDelegate.getClass();
        initWidget$default(this, blazeWidgetLayout, blazeMomentsPlayerStyle, blazeDataSourceType, null, str, null, false, blazeWidgetDelegate, null, null, null, 1896, null);
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
