package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerContainerTabsDelegate;
import com.blaze.blazesdk.features.moments.container.tabs.models.BlazeMomentsContainerTabItem;
import com.blaze.blazesdk.features.moments.inline.BlazeMomentsInlinePlayer;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import com.sofascore.results.R;
import defpackage.hzl;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hzl extends tbb {
    public static final fvl l;
    public final BlazeMomentsPlayerStyle b;
    public final BlazePlayerContainerTabsDelegate c;
    public final Function0 d;
    public final Function0 e;
    public final Function1 f;
    public final u6b g;
    public final ttk h;
    public BlazeMomentsPlaybackConfiguration i;
    public final LinkedHashMap j;
    public Integer k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b extends u {
        public static final /* synthetic */ int e = 0;
        public final zum b;
        public BlazeMomentsInlinePlayer c;
        public final /* synthetic */ hzl d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull hzl hzlVar, zum zumVar) {
            super(zumVar.a);
            zumVar.getClass();
            this.d = hzlVar;
            this.b = zumVar;
        }
    }

    static {
        new a(null);
        l = new fvl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzl(@NotNull BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function1<? super String, String> function1, @NotNull u6b u6bVar, @NotNull ttk ttkVar, @Nullable BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration) {
        super(l);
        blazeMomentsPlayerStyle.getClass();
        blazePlayerContainerTabsDelegate.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        u6bVar.getClass();
        ttkVar.getClass();
        this.b = blazeMomentsPlayerStyle;
        this.c = blazePlayerContainerTabsDelegate;
        this.d = function0;
        this.e = function02;
        this.f = function1;
        this.g = u6bVar;
        this.h = ttkVar;
        this.i = blazeMomentsPlaybackConfiguration;
        this.j = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        b bVar = (b) uVar;
        bVar.getClass();
        Object o = o(i);
        o.getClass();
        BlazeMomentsContainerTabItem blazeMomentsContainerTabItem = (BlazeMomentsContainerTabItem) o;
        FrameLayout frameLayout = bVar.b.a;
        frameLayout.getClass();
        BlazeDataSourceType dataSource = blazeMomentsContainerTabItem.getDataSource();
        final hzl hzlVar = bVar.d;
        hzlVar.getClass();
        c3m c3mVar = new c3m(hzlVar);
        boolean shouldOrderMomentsByReadStatus = blazeMomentsContainerTabItem.getShouldOrderMomentsByReadStatus();
        BlazeCachingLevel cachePolicyLevel = blazeMomentsContainerTabItem.getCachePolicyLevel();
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = new BlazeMomentsInlinePlayer(hzlVar.g, hzlVar.h, frameLayout, blazeMomentsContainerTabItem.getContainerId(), shouldOrderMomentsByReadStatus, dataSource, hzlVar.b, c3mVar, cachePolicyLevel, blazeMomentsContainerTabItem.getMomentsAdsConfigType(), hzlVar.i);
        final int i2 = 0;
        blazeMomentsInlinePlayer.setOnFirstTimeSlideStarted(new Function0(hzlVar) { // from class: nyl
            public final /* synthetic */ hzl b;

            {
                this.b = hzlVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                hzl hzlVar2 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = hzl.b.e;
                        hzlVar2.e.invoke();
                        break;
                    default:
                        int i5 = hzl.b.e;
                        hzlVar2.d.invoke();
                        break;
                }
                return Unit.a;
            }
        });
        final int i3 = 1;
        blazeMomentsInlinePlayer.setOnFirstTimeSlideDismissed(new Function0(hzlVar) { // from class: nyl
            public final /* synthetic */ hzl b;

            {
                this.b = hzlVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                hzl hzlVar2 = this.b;
                switch (i32) {
                    case 0:
                        int i4 = hzl.b.e;
                        hzlVar2.e.invoke();
                        break;
                    default:
                        int i5 = hzl.b.e;
                        hzlVar2.d.invoke();
                        break;
                }
                return Unit.a;
            }
        });
        bVar.c = blazeMomentsInlinePlayer;
        this.j.put(Integer.valueOf(i), bVar);
        Integer num = this.k;
        if (num != null && i == num.intValue()) {
            BlazeMomentsInlinePlayer blazeMomentsInlinePlayer2 = bVar.c;
            if (blazeMomentsInlinePlayer2 != null) {
                blazeMomentsInlinePlayer2.embedPlayer(true);
                return;
            }
            return;
        }
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer3 = bVar.c;
        if (blazeMomentsInlinePlayer3 != null) {
            blazeMomentsInlinePlayer3.embedPlaceholder();
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_tabs_item, viewGroup, false);
        if (inflate != null) {
            return new b(this, new zum((FrameLayout) inflate));
        }
        yhk.s("rootView");
        return null;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewDetachedFromWindow(u uVar) {
        b bVar = (b) uVar;
        bVar.getClass();
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = bVar.c;
        if (blazeMomentsInlinePlayer != null) {
            blazeMomentsInlinePlayer.embedPlaceholder();
        }
        super.onViewDetachedFromWindow(bVar);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onViewRecycled(u uVar) {
        b bVar = (b) uVar;
        bVar.getClass();
        super.onViewRecycled(bVar);
        BlazeMomentsInlinePlayer blazeMomentsInlinePlayer = bVar.c;
        if (blazeMomentsInlinePlayer != null) {
            blazeMomentsInlinePlayer.disposeContainer();
        }
        o13.z(this.j.values(), new iol(bVar, 2));
    }

    public /* synthetic */ hzl(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazePlayerContainerTabsDelegate blazePlayerContainerTabsDelegate, Function0 function0, Function0 function02, Function1 function1, u6b u6bVar, ttk ttkVar, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeMomentsPlayerStyle, blazePlayerContainerTabsDelegate, function0, function02, function1, u6bVar, ttkVar, (i & 128) != 0 ? null : blazeMomentsPlaybackConfiguration);
    }
}
