package com.blaze.blazesdk.widgets.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.analytics.enums.ThumbnailType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.custom_views.BlazeRecyclerView;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.contracts.BaseWidgetContract;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4427z5;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.setting.i;
import com.sofascore.results.R;
import com.vungle.ads.internal.task.g;
import defpackage.a2m;
import defpackage.byl;
import defpackage.cql;
import defpackage.cyl;
import defpackage.duf;
import defpackage.g7h;
import defpackage.gzk;
import defpackage.gzm;
import defpackage.ix1;
import defpackage.jul;
import defpackage.jx1;
import defpackage.km5;
import defpackage.kul;
import defpackage.lul;
import defpackage.lx1;
import defpackage.ly3;
import defpackage.lz;
import defpackage.m1;
import defpackage.m5m;
import defpackage.mqi;
import defpackage.mx1;
import defpackage.qha;
import defpackage.qtk;
import defpackage.sha;
import defpackage.skd;
import defpackage.stk;
import defpackage.sub;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.ufa;
import defpackage.xxl;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ypl;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00042\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u00020\u00112\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00182\u0006\u0010\u001c\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0017¢\u0006\u0004\b!\u0010 J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"H\u0017¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0007¢\u0006\u0004\b(\u0010 J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u00028\u00018\u0014@\u0014X\u0094.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0004X\u0084\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010@\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010M\u001a\u00020>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8$X¤\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8$X¤\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\"\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0_8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020>8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bb\u0010BR\u0014\u0010e\u001a\u00020\"8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bd\u0010$R\u0014\u0010i\u001a\u00020f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00110v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006z"}, d2 = {"Lcom/blaze/blazesdk/widgets/ui/BlazeBaseWidget;", "T", "Lcql;", "VM", "Lcom/blaze/blazesdk/widgets/ui/ShimmeringView;", "Lcom/blaze/blazesdk/widgets/contracts/BaseWidgetContract;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "isSilentRefresh", "", "reloadData", "(Z)V", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "dataSourceType", "updateDataSource", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Z)V", "", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemCustomMapping;", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemStyleOverrides;", "perItemStyleOverrides", "shouldUpdateUi", "updateOverrideStyles", "(Ljava/util/Map;Z)V", "resetOverriddenStyles", "()V", "updateWidgetsUi", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "getCurrentWidgetLayout", "()Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;", "blazeWidgetLayout", "updateWidgetLayout", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetLayout;)V", "deleteAllData", "getThumbnailPositionToPlay", "()I", "Ljul;", "e", "Ljoa;", "getAdapter$blazesdk_release", "()Ljul;", L6.G1, InneractiveMediationDefs.GENDER_FEMALE, "Lcql;", "getViewModel", "()Lcql;", "setViewModel", "(Lcql;)V", "viewModel", "Lgzm;", g.e, "Lgzm;", "getBinding", "()Lgzm;", "binding", "", h.b, "Ljava/lang/String;", "getThumbnailSize", "()Ljava/lang/String;", "setThumbnailSize", "(Ljava/lang/String;)V", "thumbnailSize", i.a, "getThumbnailAspectRatio", "setThumbnailAspectRatio", "thumbnailAspectRatio", j.b, "getWidgetSize", "setWidgetSize", "widgetSize", "Lbyl;", C4427z5.q, "getSkeletonsAdapter", "()Lbyl;", "skeletonsAdapter", "Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "getWidgetType", "()Lcom/blaze/blazesdk/analytics/enums/WidgetType;", "widgetType", "Lkul;", "getItemDecoration", "()Lkul;", "itemDecoration", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getWidgetLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "widgetLayoutManager", "", "getPerItemStyleOverrides", "()Ljava/util/Map;", "getAccessibilityIdentifierPrefix", "accessibilityIdentifierPrefix", "getWidgetLayout", "widgetLayout", "Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;", "getThumbnailType", "()Lcom/blaze/blazesdk/analytics/enums/ThumbnailType;", "thumbnailType", "Lcom/blaze/blazesdk/style/widgets/BlazeViewType;", "getViewType", "()Lcom/blaze/blazesdk/style/widgets/BlazeViewType;", "viewType", "Lxxl;", "getContainerSizeProviderForAdapter", "()Lxxl;", "containerSizeProviderForAdapter", "Lcom/blaze/blazesdk/custom_views/BlazeRecyclerView;", "getWidgetRecyclerView$blazesdk_release", "()Lcom/blaze/blazesdk/custom_views/BlazeRecyclerView;", "widgetRecyclerView", "", "getCreateSkeletonsList", "()Ljava/util/List;", "createSkeletonsList", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BlazeBaseWidget<T, VM extends cql> extends ShimmeringView implements BaseWidgetContract {
    public static final /* synthetic */ int q = 0;
    public final mqi e;

    /* renamed from: f, reason: from kotlin metadata */
    public cql viewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final gzm binding;

    /* renamed from: h, reason: from kotlin metadata */
    public String thumbnailSize;

    /* renamed from: i, reason: from kotlin metadata */
    public String thumbnailAspectRatio;

    /* renamed from: j, reason: from kotlin metadata */
    public String widgetSize;
    public BroadcastReceiver k;
    public cyl l;
    public androidx.recyclerview.widget.i m;
    public final mqi n;
    public final mx1 o;
    public final mx1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v7, types: [mx1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [mx1] */
    @Keep
    public BlazeBaseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.e = ypa.b(new lx1(this, 2));
        final int i3 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_widget_list, (ViewGroup) this, false);
        addView(inflate);
        if (inflate == null) {
            yhk.s("rootView");
            throw null;
        }
        BlazeRecyclerView blazeRecyclerView = (BlazeRecyclerView) inflate;
        this.binding = new gzm(blazeRecyclerView, blazeRecyclerView);
        this.thumbnailSize = "";
        this.thumbnailAspectRatio = "";
        this.widgetSize = "";
        this.n = ypa.b(new lx1(this, 3));
        this.o = new skd(this) { // from class: mx1
            public final /* synthetic */ BlazeBaseWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.skd
            public final void h(Object obj) {
                int i4 = i3;
                BlazeBaseWidget blazeBaseWidget = this.b;
                switch (i4) {
                    case 0:
                        BlazeBaseWidget.e(blazeBaseWidget, (cql.a) obj);
                        break;
                    default:
                        Integer num = (Integer) obj;
                        int i5 = BlazeBaseWidget.q;
                        if (num != null) {
                            int intValue = num.intValue();
                            n layoutManager = blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
                            }
                            blazeBaseWidget.getViewModel().n.k(null);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 1;
        this.p = new skd(this) { // from class: mx1
            public final /* synthetic */ BlazeBaseWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.skd
            public final void h(Object obj) {
                int i42 = i4;
                BlazeBaseWidget blazeBaseWidget = this.b;
                switch (i42) {
                    case 0:
                        BlazeBaseWidget.e(blazeBaseWidget, (cql.a) obj);
                        break;
                    default:
                        Integer num = (Integer) obj;
                        int i5 = BlazeBaseWidget.q;
                        if (num != null) {
                            int intValue = num.intValue();
                            n layoutManager = blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.scrollToPositionWithOffset(intValue, 0);
                            }
                            blazeBaseWidget.getViewModel().n.k(null);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static LinkedHashMap c(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(sub.c(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            BlazeWidgetItemStyleOverrides blazeWidgetItemStyleOverrides = (BlazeWidgetItemStyleOverrides) entry.getValue();
            linkedHashMap.put(key, blazeWidgetItemStyleOverrides != null ? (BlazeWidgetItemStyleOverrides) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetItemStyleOverrides) : null);
        }
        return linkedHashMap;
    }

    public static final Unit d(BlazeWidgetLayout blazeWidgetLayout, BlazeBaseWidget blazeBaseWidget) {
        cql viewModel = blazeBaseWidget.getViewModel();
        viewModel.getClass();
        blazeWidgetLayout.getClass();
        Integer maxDisplayItemsCount = viewModel.x().getMaxDisplayItemsCount();
        BlazeWidgetLayout blazeWidgetLayout2 = (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetLayout);
        blazeWidgetLayout2.getClass();
        viewModel.i = blazeWidgetLayout2;
        Object d = viewModel.d.d();
        cql.a.c cVar = d instanceof cql.a.c ? (cql.a.c) d : null;
        if (!Intrinsics.c(maxDisplayItemsCount, blazeWidgetLayout.getMaxDisplayItemsCount()) && cVar != null) {
            viewModel.m(cVar.b);
        }
        jul adapter$blazesdk_release = blazeBaseWidget.getAdapter$blazesdk_release();
        BlazeWidgetLayout widgetLayout = blazeBaseWidget.getWidgetLayout();
        adapter$blazesdk_release.getClass();
        widgetLayout.getClass();
        adapter$blazesdk_release.c = widgetLayout;
        byl skeletonsAdapter = blazeBaseWidget.getSkeletonsAdapter();
        BlazeWidgetLayout widgetLayout2 = blazeBaseWidget.getWidgetLayout();
        skeletonsAdapter.getClass();
        widgetLayout2.getClass();
        skeletonsAdapter.c = widgetLayout2;
        kul itemDecoration = blazeBaseWidget.getItemDecoration();
        BlazeWidgetLayout widgetLayout3 = blazeBaseWidget.getWidgetLayout();
        itemDecoration.getClass();
        widgetLayout3.getClass();
        LinearLayoutManager widgetLayoutManager = blazeBaseWidget.getWidgetLayoutManager();
        GridLayoutManager gridLayoutManager = widgetLayoutManager instanceof GridLayoutManager ? (GridLayoutManager) widgetLayoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.C(blazeBaseWidget.getWidgetLayout().getUpdatedColumns());
        }
        blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().setPadding(blazeBaseWidget.getWidgetLayout().getMargins().getStart().getToPx$blazesdk_release(), blazeBaseWidget.getWidgetLayout().getMargins().getTop().getToPx$blazesdk_release(), blazeBaseWidget.getWidgetLayout().getMargins().getEnd().getToPx$blazesdk_release(), blazeBaseWidget.getWidgetLayout().getMargins().getBottom().getToPx$blazesdk_release());
        blazeBaseWidget.i();
        return Unit.a;
    }

    public static final void e(BlazeBaseWidget blazeBaseWidget, cql.a aVar) {
        aVar.getClass();
        if (aVar instanceof cql.a.b) {
            return;
        }
        if (aVar instanceof cql.a.d) {
            try {
                if (!Intrinsics.c(blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().getAdapter(), blazeBaseWidget.getSkeletonsAdapter())) {
                    blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().setAdapter(blazeBaseWidget.getSkeletonsAdapter());
                }
                blazeBaseWidget.getSkeletonsAdapter().p(blazeBaseWidget.getCreateSkeletonsList());
                blazeBaseWidget.a();
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
            blazeBaseWidget.getAdapter$blazesdk_release().p(null);
            BlazeRecyclerView widgetRecyclerView$blazesdk_release = blazeBaseWidget.getWidgetRecyclerView$blazesdk_release();
            String str = blazeBaseWidget.getAccessibilityIdentifierPrefix() + "_loading_list";
            widgetRecyclerView$blazesdk_release.getClass();
            widgetRecyclerView$blazesdk_release.setTag(str);
            return;
        }
        if (!(aVar instanceof cql.a.c)) {
            if (!(aVar instanceof cql.a.C1350a)) {
                zzl.b();
                return;
            }
            blazeBaseWidget.b();
            if (!Intrinsics.c(blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().getAdapter(), blazeBaseWidget.getSkeletonsAdapter())) {
                blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().setAdapter(blazeBaseWidget.getSkeletonsAdapter());
            }
            blazeBaseWidget.getSkeletonsAdapter().p(km5.a);
            BlazeRecyclerView widgetRecyclerView$blazesdk_release2 = blazeBaseWidget.getWidgetRecyclerView$blazesdk_release();
            String str2 = blazeBaseWidget.getAccessibilityIdentifierPrefix() + "_error_list";
            widgetRecyclerView$blazesdk_release2.getClass();
            widgetRecyclerView$blazesdk_release2.setTag(str2);
            return;
        }
        blazeBaseWidget.h(new ix1(9, blazeBaseWidget, blazeBaseWidget.getViewModel().x()));
        ArrayList U0 = CollectionsKt.U0(((cql.a.c) aVar).a);
        try {
            if (!Intrinsics.c(blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().getAdapter(), blazeBaseWidget.getAdapter$blazesdk_release())) {
                blazeBaseWidget.getWidgetRecyclerView$blazesdk_release().setAdapter(blazeBaseWidget.getAdapter$blazesdk_release());
            }
            blazeBaseWidget.b();
            blazeBaseWidget.getAdapter$blazesdk_release().p(U0);
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
        BlazeRecyclerView widgetRecyclerView$blazesdk_release3 = blazeBaseWidget.getWidgetRecyclerView$blazesdk_release();
        String str3 = blazeBaseWidget.getAccessibilityIdentifierPrefix() + "_loaded_list";
        widgetRecyclerView$blazesdk_release3.getClass();
        widgetRecyclerView$blazesdk_release3.setTag(str3);
    }

    private final List<Unit> getCreateSkeletonsList() {
        ArrayList arrayList = new ArrayList();
        int maxDisplayItemsCountForSkeletons = getWidgetLayout().getMaxDisplayItemsCountForSkeletons();
        for (int i = 0; i < maxDisplayItemsCountForSkeletons; i++) {
            arrayList.add(Unit.a);
        }
        return arrayList;
    }

    private final byl getSkeletonsAdapter() {
        return (byl) this.n.getValue();
    }

    private final int getThumbnailPositionToPlay() {
        int findFirstVisibleItemPosition = getWidgetLayoutManager().findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = getWidgetLayoutManager().findLastVisibleItemPosition();
        int width = this.binding.b.getWidth();
        int horizontalAnimationTriggerPercentage = (int) (width * (lz.A(this) ? 1.0f - getWidgetLayout().getWidgetItemStyle().getImage().getAnimatedThumbnail().getHorizontalAnimationTriggerPercentage() : getWidgetLayout().getWidgetItemStyle().getImage().getAnimatedThumbnail().getHorizontalAnimationTriggerPercentage()));
        if (findFirstVisibleItemPosition > findLastVisibleItemPosition) {
            return -1;
        }
        while (true) {
            View findViewByPosition = getWidgetLayoutManager().findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition != null) {
                int left = findViewByPosition.getLeft();
                int right = findViewByPosition.getRight();
                int toPx$blazesdk_release = getWidgetLayout().getHorizontalItemsSpacing().getToPx$blazesdk_release();
                int i = left - toPx$blazesdk_release;
                if (horizontalAnimationTriggerPercentage <= toPx$blazesdk_release + right && i <= horizontalAnimationTriggerPercentage && (getAdapter$blazesdk_release().k == findFirstVisibleItemPosition || (left >= 0 && right <= width))) {
                    break;
                }
            }
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                return -1;
            }
            findFirstVisibleItemPosition++;
        }
        return findFirstVisibleItemPosition;
    }

    @Keep
    public final void deleteAllData() {
        h(new lx1(this, 1));
    }

    public abstract void f(String str, F f);

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(String str, Class cls) {
        ttk u;
        str.getClass();
        if (this.viewModel != null || (u = sha.u(this)) == null) {
            return;
        }
        stk viewModelStore = u.getViewModelStore();
        qtk s = ufa.s(u);
        ly3 r = ufa.r(u);
        viewModelStore.getClass();
        s.getClass();
        r.getClass();
        setViewModel((cql) new g7h(viewModelStore, s, r).u(str, duf.a.getOrCreateKotlinClass(cls)));
        cql viewModel = getViewModel();
        viewModel.getClass();
        viewModel.h = str;
    }

    @NotNull
    public final String getAccessibilityIdentifierPrefix() {
        return getViewModel().w();
    }

    @NotNull
    public final jul getAdapter$blazesdk_release() {
        return (jul) this.e.getValue();
    }

    @NotNull
    public final gzm getBinding() {
        return this.binding;
    }

    @NotNull
    public final xxl getContainerSizeProviderForAdapter() {
        return new xxl(this);
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    @Nullable
    public BlazeWidgetLayout getCurrentWidgetLayout() {
        if (this.viewModel != null) {
            return (BlazeWidgetLayout) ParcelableExtensionKt.blazeDeepCopy(getWidgetLayout());
        }
        return null;
    }

    @NotNull
    public abstract kul getItemDecoration();

    @NotNull
    public final Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> getPerItemStyleOverrides() {
        LinkedHashMap linkedHashMap = getViewModel().j;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        Intrinsics.i("perItemStyleOverrides");
        throw null;
    }

    @NotNull
    public final String getThumbnailAspectRatio() {
        return this.thumbnailAspectRatio;
    }

    @NotNull
    public final String getThumbnailSize() {
        return this.thumbnailSize;
    }

    @NotNull
    public final ThumbnailType getThumbnailType() {
        int i = lul.a[getViewModel().x().getWidgetItemStyle().getImage().getThumbnailType().ordinal()];
        if (i == 1) {
            return ThumbnailType.CIRCLE;
        }
        if (i == 2) {
            return ThumbnailType.Custom;
        }
        if (i == 3) {
            return ThumbnailType.RECTANGLE;
        }
        if (i == 4 || i == 5) {
            return ThumbnailType.RECTANGLE;
        }
        zzl.b();
        return null;
    }

    @NotNull
    public VM getViewModel() {
        VM vm = (VM) this.viewModel;
        if (vm != null) {
            return vm;
        }
        Intrinsics.i("viewModel");
        throw null;
    }

    @NotNull
    public final BlazeViewType getViewType() {
        return getWidgetType() == WidgetType.GRID ? BlazeViewType.GRID_VIEW : BlazeViewType.ROW_VIEW;
    }

    @NotNull
    public final BlazeWidgetLayout getWidgetLayout() {
        return getViewModel().x();
    }

    @NotNull
    public abstract LinearLayoutManager getWidgetLayoutManager();

    @NotNull
    public final BlazeRecyclerView getWidgetRecyclerView$blazesdk_release() {
        BlazeRecyclerView blazeRecyclerView = this.binding.b;
        blazeRecyclerView.getClass();
        return blazeRecyclerView;
    }

    @NotNull
    public final String getWidgetSize() {
        return this.widgetSize;
    }

    @NotNull
    public abstract WidgetType getWidgetType();

    public final void h(Function0 function0) {
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new a2m(this, this, function0));
        } else {
            if (this.viewModel == null) {
                throw BlazeException.WidgetNotInitializedException.INSTANCE;
            }
            function0.invoke();
        }
    }

    public final void i() {
        l adapter = getWidgetRecyclerView$blazesdk_release().getAdapter();
        if (adapter instanceof byl) {
            byl bylVar = (byl) adapter;
            List list = bylVar.a.f;
            list.getClass();
            bylVar.p(new ArrayList(list));
            return;
        }
        if (adapter instanceof jul) {
            jul julVar = (jul) adapter;
            List list2 = julVar.a.f;
            list2.getClass();
            julVar.p(new ArrayList(list2));
        }
    }

    public final void j() {
        if (getWidgetRecyclerView$blazesdk_release().getLayoutManager() != null) {
            return;
        }
        getWidgetRecyclerView$blazesdk_release().setLayoutManager(getWidgetLayoutManager());
        getWidgetRecyclerView$blazesdk_release().setPadding(getWidgetLayout().getMargins().getStart().getToPx$blazesdk_release(), getWidgetLayout().getMargins().getTop().getToPx$blazesdk_release(), getWidgetLayout().getMargins().getEnd().getToPx$blazesdk_release(), getWidgetLayout().getMargins().getBottom().getToPx$blazesdk_release());
        getWidgetRecyclerView$blazesdk_release().setItemAnimator(null);
        BlazeRecyclerView widgetRecyclerView$blazesdk_release = getWidgetRecyclerView$blazesdk_release();
        kul itemDecoration = getItemDecoration();
        widgetRecyclerView$blazesdk_release.getClass();
        itemDecoration.getClass();
        while (widgetRecyclerView$blazesdk_release.getItemDecorationCount() > 0) {
            widgetRecyclerView$blazesdk_release.removeItemDecorationAt(0);
        }
        widgetRecyclerView$blazesdk_release.addItemDecoration(itemDecoration);
        if (getWidgetLayout().getWidgetItemStyle().getImage().getAnimatedThumbnail().isEnabled()) {
            androidx.recyclerview.widget.i iVar = this.m;
            gzm gzmVar = this.binding;
            if (iVar == null) {
                androidx.recyclerview.widget.i iVar2 = new androidx.recyclerview.widget.i();
                this.m = iVar2;
                iVar2.attachToRecyclerView(gzmVar.b);
                Unit unit = Unit.a;
            }
            gzmVar.b.clearOnScrollListeners();
            gzmVar.b.addOnScrollListener(new m5m(this));
        }
    }

    public final void k() {
        int thumbnailPositionToPlay;
        if (getWidgetLayout().getWidgetItemStyle().getImage().getAnimatedThumbnail().isEnabled() && (thumbnailPositionToPlay = getThumbnailPositionToPlay()) != -1) {
            jul adapter$blazesdk_release = getAdapter$blazesdk_release();
            RecyclerView recyclerView = adapter$blazesdk_release.j;
            u findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(adapter$blazesdk_release.k) : null;
            jul.a aVar = findViewHolderForAdapterPosition instanceof jul.a ? (jul.a) findViewHolderForAdapterPosition : null;
            if (aVar != null) {
                aVar.c.b.stopAnimatedThumbnail();
            }
            adapter$blazesdk_release.k = -1;
            jul adapter$blazesdk_release2 = getAdapter$blazesdk_release();
            adapter$blazesdk_release2.getClass();
            if (thumbnailPositionToPlay == -1 || thumbnailPositionToPlay == -1 || thumbnailPositionToPlay == adapter$blazesdk_release2.k) {
                return;
            }
            try {
                RecyclerView recyclerView2 = adapter$blazesdk_release2.j;
                u findViewHolderForAdapterPosition2 = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(thumbnailPositionToPlay) : null;
                jul.a aVar2 = findViewHolderForAdapterPosition2 instanceof jul.a ? (jul.a) findViewHolderForAdapterPosition2 : null;
                if (aVar2 != null) {
                    aVar2.c.b.playAnimatedThumbnail(aVar2.f.i);
                    adapter$blazesdk_release2.k = thumbnailPositionToPlay;
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
    }

    public final void l() {
        gzk gzkVar = gzk.a;
        String w = getViewModel().w();
        ErrorDomain errorDomain = ErrorDomain.WIDGET;
        BroadcastReceiver createPlayerBroadcastReceiver$blazesdk_release$default = gzk.createPlayerBroadcastReceiver$blazesdk_release$default(gzkVar, w, getViewModel().o, errorDomain, null, 8, null);
        this.k = createPlayerBroadcastReceiver$blazesdk_release$default;
        if (createPlayerBroadcastReceiver$blazesdk_release$default != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(createPlayerBroadcastReceiver$blazesdk_release$default);
        }
        gzk.handleUnhandledEvents$blazesdk_release$default(gzkVar, getViewModel().w(), getViewModel().o, errorDomain, getContext(), null, 16, null);
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(getContext()).registerReceiver(broadcastReceiver, new IntentFilter("player_broadcast"));
        }
        try {
            u6b w2 = qha.w(this);
            if (w2 != null) {
                cyl cylVar = this.l;
                if (cylVar != null) {
                    w2.getLifecycle().d(cylVar);
                }
                cyl cylVar2 = new cyl(this);
                w2.getLifecycle().a(cylVar2);
                this.l = cylVar2;
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // com.blaze.blazesdk.widgets.ui.ShimmeringView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (this.viewModel != null) {
                l();
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // com.blaze.blazesdk.widgets.ui.ShimmeringView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(broadcastReceiver);
        }
        if (this.viewModel != null) {
            getViewModel().d.i(this.o);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = ypl.b[getViewType().ordinal()];
        if (i5 == 1) {
            if (i <= 0 || i == i3) {
                return;
            }
            i();
            return;
        }
        if (i5 != 2) {
            zzl.b();
        } else {
            if (i2 <= 0 || i2 == i4) {
                return;
            }
            i();
        }
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void reloadData(boolean isSilentRefresh) {
        h(new m1(this, isSilentRefresh, 2));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void resetOverriddenStyles() {
        h(new jx1(null, this, true));
    }

    public final void setThumbnailAspectRatio(@NotNull String str) {
        str.getClass();
        this.thumbnailAspectRatio = str;
    }

    public final void setThumbnailSize(@NotNull String str) {
        str.getClass();
        this.thumbnailSize = str;
    }

    public void setViewModel(@NotNull VM vm) {
        vm.getClass();
        this.viewModel = vm;
    }

    public final void setWidgetSize(@NotNull String str) {
        str.getClass();
        this.widgetSize = str;
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void updateDataSource(@NotNull BlazeDataSourceType dataSourceType, boolean isSilentRefresh) {
        dataSourceType.getClass();
        h(new jx1(this, dataSourceType, isSilentRefresh, 0));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void updateOverrideStyles(@NotNull Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides, boolean shouldUpdateUi) {
        perItemStyleOverrides.getClass();
        h(new jx1(perItemStyleOverrides, this, shouldUpdateUi));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void updateWidgetLayout(@NotNull BlazeWidgetLayout blazeWidgetLayout) {
        blazeWidgetLayout.getClass();
        h(new ix1(9, this, blazeWidgetLayout));
    }

    @Override // com.blaze.blazesdk.widgets.contracts.BaseWidgetContract
    @Keep
    public void updateWidgetsUi() {
        h(new lx1(this, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ BlazeBaseWidget(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeBaseWidget(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
