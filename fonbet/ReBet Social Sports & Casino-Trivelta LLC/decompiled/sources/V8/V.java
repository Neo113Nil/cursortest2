package V8;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.ui.GPHSettings;
import com.giphy.sdk.ui.pagination.GPHContent;
import com.giphy.sdk.ui.views.GifView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class V extends FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final a f12643u = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public T8.k f12644a;

    /* renamed from: b, reason: collision with root package name */
    public C1741w f12645b;

    /* renamed from: c, reason: collision with root package name */
    public Future f12646c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1729j f12647d;

    /* renamed from: e, reason: collision with root package name */
    public A f12648e;

    /* renamed from: f, reason: collision with root package name */
    public int f12649f;

    /* renamed from: g, reason: collision with root package name */
    public GPHContent f12650g;

    /* renamed from: h, reason: collision with root package name */
    public int f12651h;

    /* renamed from: i, reason: collision with root package name */
    public int f12652i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12653j;

    /* renamed from: k, reason: collision with root package name */
    public Q8.e f12654k;

    /* renamed from: l, reason: collision with root package name */
    public RenditionType f12655l;

    /* renamed from: m, reason: collision with root package name */
    public RenditionType f12656m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12657n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12658o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12659p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12660q;

    /* renamed from: r, reason: collision with root package name */
    public S8.c f12661r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12662s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12663t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f12664d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ V f12665e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Media f12666f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C1728i f12667g;

        public static final class a implements K8.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1728i f12668a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Media f12669b;

            public a(C1728i c1728i, Media media) {
                this.f12668a = c1728i;
                this.f12669b = media;
            }

            @Override // K8.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void a(ListMediaResponse listMediaResponse, Throwable th2) {
                List<Media> emptyList;
                if (listMediaResponse == null || (emptyList = listMediaResponse.getData()) == null) {
                    emptyList = CollectionsKt.emptyList();
                }
                if (emptyList.isEmpty()) {
                    return;
                }
                this.f12668a.q(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f12669b), (Iterable) emptyList));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, V v10, Media media, C1728i c1728i) {
            super(0);
            this.f12664d = z10;
            this.f12665e = v10;
            this.f12666f = media;
            this.f12667g = c1728i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m25invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m25invoke() {
            if (this.f12664d) {
                this.f12665e.f12646c = J8.d.f5962a.d().k(this.f12666f.getId(), new a(this.f12667g, this.f12666f));
            }
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m26invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m26invoke() {
            Future future = V.this.f12646c;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T8.l f12672e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f12673f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T8.l lVar, int i10) {
            super(1);
            this.f12672e = lVar;
            this.f12673f = i10;
        }

        public final void a(Media media) {
            if (media != null) {
                V.this.f12644a.getGifTrackingManager$giphy_ui_2_3_17_release().h(media, ActionType.CLICK);
                V.this.k(new T8.l(T8.m.f11331c, media, this.f12672e.c()), this.f12673f);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C1728i f12674d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ V f12675e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T8.l f12676f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f12677g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1728i c1728i, V v10, T8.l lVar, int i10) {
            super(1);
            this.f12674d = c1728i;
            this.f12675e = v10;
            this.f12676f = lVar;
            this.f12677g = i10;
        }

        public final void a(Media media) {
            this.f12674d.n();
            if (media != null) {
                this.f12675e.t(new T8.l(T8.m.f11331c, media, this.f12676f.c()), this.f12677g);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(int i10) {
            InterfaceC1729j callback = V.this.getCallback();
            if (callback != null) {
                callback.b(i10);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function2 {
        public g(Object obj) {
            super(2, obj, V.class, "onGifSelected", "onGifSelected(Lcom/giphy/sdk/ui/universallist/SmartItemData;I)V", 0);
        }

        public final void a(T8.l p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((V) this.receiver).m(p02, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((T8.l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function2 {
        public h(Object obj) {
            super(2, obj, V.class, "onLongPressGif", "onLongPressGif(Lcom/giphy/sdk/ui/universallist/SmartItemData;I)V", 0);
        }

        public final void a(T8.l p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((V) this.receiver).n(p02, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((T8.l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class i extends RecyclerView.v {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            A searchCallback = V.this.getSearchCallback();
            if (searchCallback != null) {
                searchCallback.a(i10, i11);
            }
        }
    }

    public /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        public j(Object obj) {
            super(1, obj, V.class, "queryUsername", "queryUsername(Ljava/lang/String;)V", 0);
        }

        public final void a(String str) {
            ((V) this.receiver).p(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class k extends FunctionReferenceImpl implements Function1 {
        public k(Object obj) {
            super(1, obj, V.class, "onRemoveRecentGif", "onRemoveRecentGif(Ljava/lang/String;)V", 0);
        }

        public final void a(String str) {
            ((V) this.receiver).o(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Media f12681e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ T8.l f12682f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f12683g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Media media, T8.l lVar, int i10) {
            super(1);
            this.f12681e = media;
            this.f12682f = lVar;
            this.f12683g = i10;
        }

        public final void a(Media it) {
            Intrinsics.checkNotNullParameter(it, "it");
            V.this.f12644a.getGifTrackingManager$giphy_ui_2_3_17_release().h(this.f12681e, ActionType.CLICK);
            V.this.k(this.f12682f, this.f12683g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ V(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ void r(V v10, C1728i c1728i, T8.l lVar, List list, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        v10.q(c1728i, lVar, list, i10, z10);
    }

    @Nullable
    public final InterfaceC1729j getCallback() {
        return this.f12647d;
    }

    public final int getCellPadding() {
        return this.f12651h;
    }

    @Nullable
    public final RenditionType getClipsPreviewRenditionType() {
        return this.f12656m;
    }

    @Nullable
    public final GPHContent getContent() {
        return this.f12650g;
    }

    public final int getDirection() {
        return this.f12649f;
    }

    public final boolean getDisableEmojiVariations() {
        return this.f12659p;
    }

    public final boolean getEnableDynamicText() {
        return this.f12657n;
    }

    public final boolean getEnablePartnerProfiles() {
        return this.f12658o;
    }

    public final boolean getFixedSizeCells() {
        return this.f12662s;
    }

    @NotNull
    public final Q8.e getImageFormat() {
        return this.f12654k;
    }

    @Nullable
    public final RenditionType getRenditionType() {
        return this.f12655l;
    }

    @Nullable
    public final A getSearchCallback() {
        return this.f12648e;
    }

    public final boolean getShowCheckeredBackground() {
        return this.f12653j;
    }

    public final boolean getShowViewOnGiphy() {
        return this.f12660q;
    }

    public final int getSpanCount() {
        return this.f12652i;
    }

    @NotNull
    public final S8.c getTheme() {
        return this.f12661r;
    }

    public final boolean getUseInExtensionMode() {
        return this.f12663t;
    }

    public final void j() {
        this.f12644a.setCellPadding(this.f12651h);
        this.f12644a.setSpanCount(this.f12652i);
        this.f12644a.setOrientation(this.f12649f);
    }

    public final void k(T8.l lVar, int i10) {
        Media b10 = lVar.b();
        if (b10 != null) {
            O8.k.f8390a.g().a(b10);
        }
        if (lVar.d() == T8.m.f11331c || lVar.d() == T8.m.f11330b || lVar.d() == T8.m.f11333e || lVar.d() == T8.m.f11332d) {
            Object a10 = lVar.a();
            Media media = a10 instanceof Media ? (Media) a10 : null;
            if (media != null) {
                media.setBottleData(null);
                InterfaceC1729j interfaceC1729j = this.f12647d;
                if (interfaceC1729j != null) {
                    interfaceC1729j.a(media);
                }
            }
        }
    }

    public final void l(T8.l lVar, int i10) {
        Future future = this.f12646c;
        if (future != null) {
            future.cancel(true);
        }
        Media b10 = lVar.b();
        if (b10 == null) {
            return;
        }
        Integer variationCount = b10.getVariationCount();
        if ((variationCount != null ? variationCount.intValue() : 0) <= 0 || this.f12659p) {
            k(lVar, i10);
            return;
        }
        C1728i c1728i = new C1728i();
        Integer variationCount2 = b10.getVariationCount();
        int intValue = variationCount2 != null ? variationCount2.intValue() : 0;
        ArrayList arrayList = new ArrayList(intValue);
        for (int i11 = 0; i11 < intValue; i11++) {
            arrayList.add(null);
        }
        r(this, c1728i, lVar, arrayList, i10, false, 16, null);
        c1728i.p();
    }

    public final void m(T8.l lVar, int i10) {
        Object a10 = lVar.a();
        Media media = a10 instanceof Media ? (Media) a10 : null;
        if (media != null) {
            if (Intrinsics.areEqual(N8.j.a(media), Boolean.TRUE)) {
                l(lVar, i10);
            } else {
                k(lVar, i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    public final void n(T8.l lVar, int i10) {
        GifView gifView;
        A a10;
        A a11;
        RecyclerView.F e02 = this.f12644a.e0(i10);
        GifView gifView2 = e02 != null ? e02.itemView : null;
        GifView gifView3 = gifView2 instanceof GifView ? gifView2 : null;
        if (gifView3 != null && (a11 = this.f12648e) != null) {
            a11.b(gifView3);
        }
        if (gifView2 != null && (gifView = (GifView) gifView2.findViewById(O8.s.f8445D)) != null && (a10 = this.f12648e) != null) {
            a10.b(gifView);
        }
        t(lVar, i10);
    }

    public final void o(String str) {
        GPHContent gPHContent = this.f12650g;
        GPHContent.Companion companion = GPHContent.f31771h;
        if (Intrinsics.areEqual(gPHContent, companion.getRecents())) {
            O8.k.f8390a.g().d(str);
            this.f12644a.l2(companion.getRecents());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        timber.log.a.a("onAttachedToWindow", new Object[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        timber.log.a.a("onDetachedFromWindow", new Object[0]);
        this.f12644a.getGifTrackingManager$giphy_ui_2_3_17_release().g();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        timber.log.a.a("onRestoreInstanceState", new Object[0]);
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        timber.log.a.a("onSaveInstanceState", new Object[0]);
        return super.onSaveInstanceState();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        timber.log.a.a("onWindowFocusChanged " + z10, new Object[0]);
        if (z10) {
            this.f12644a.getGifTrackingManager$giphy_ui_2_3_17_release().i();
        }
    }

    public final void p(String str) {
        A a10;
        this.f12644a.l2(GPHContent.Companion.searchQuery$default(GPHContent.f31771h, '@' + str, null, null, 6, null));
        if (str == null || (a10 = this.f12648e) == null) {
            return;
        }
        a10.c(str);
    }

    public final void q(C1728i c1728i, T8.l lVar, List list, int i10, boolean z10) {
        Context context;
        Future future = this.f12646c;
        if (future != null) {
            future.cancel(true);
        }
        Object a10 = lVar.a();
        Media media = a10 instanceof Media ? (Media) a10 : null;
        if (media == null || (context = getContext()) == null) {
            return;
        }
        RecyclerView.F e02 = this.f12644a.e0(i10);
        View view = e02 != null ? e02.itemView : null;
        GifView gifView = view instanceof GifView ? (GifView) view : null;
        if (gifView == null) {
            return;
        }
        int width = (int) (gifView.getWidth() * gifView.getScaleX());
        int height = (int) (gifView.getHeight() * gifView.getScaleY());
        O8.k kVar = O8.k.f8390a;
        c1728i.o(context, gifView, width, height, kVar.h().j(), kVar.h().i(), kVar.h().h(), CollectionsKt.plus((Collection) CollectionsKt.listOf(media), (Iterable) list), new b(z10, this, media, c1728i), new c(), new d(lVar, i10), new e(c1728i, this, lVar, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.a(r1) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        if (!this.f12663t) {
            J8.e eVar = J8.e.f5969a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
        }
        timber.log.a.a("Using extensionsApiClient", new Object[0]);
        T8.k kVar = this.f12644a;
        J8.d dVar = J8.d.f5962a;
        kVar.setApiClient$giphy_ui_2_3_17_release(dVar.b("extensionApiClient", dVar.d().l(), false));
        this.f12644a.setCellPadding(this.f12651h);
        this.f12644a.setSpanCount(this.f12652i);
        this.f12644a.setOrientation(this.f12649f);
        this.f12644a.setOnResultsUpdateListener(new f());
        this.f12644a.setOnItemSelectedListener(new g(this));
        this.f12644a.setOnItemLongPressListener(new h(this));
        this.f12644a.n(new i());
        j();
    }

    public final void setCallback(@Nullable InterfaceC1729j interfaceC1729j) {
        this.f12647d = interfaceC1729j;
    }

    public final void setCellPadding(int i10) {
        this.f12651h = i10;
        j();
    }

    public final void setClipsPreviewRenditionType(@Nullable RenditionType renditionType) {
        this.f12656m = renditionType;
        this.f12644a.getGifsAdapter().k().k(renditionType);
    }

    public final void setContent(@Nullable GPHContent gPHContent) {
        GPHContent gPHContent2 = this.f12650g;
        if (Intrinsics.areEqual(gPHContent2 != null ? gPHContent2.l() : null, gPHContent != null ? gPHContent.l() : null)) {
            GPHContent gPHContent3 = this.f12650g;
            if ((gPHContent3 != null ? gPHContent3.j() : null) == (gPHContent != null ? gPHContent.j() : null)) {
                GPHContent gPHContent4 = this.f12650g;
                if ((gPHContent4 != null ? gPHContent4.k() : null) == (gPHContent != null ? gPHContent.k() : null)) {
                    return;
                }
            }
        }
        this.f12650g = gPHContent;
        if (gPHContent != null) {
            this.f12644a.l2(gPHContent);
        } else {
            this.f12644a.X1();
        }
    }

    public final void setDirection(int i10) {
        this.f12649f = i10;
        j();
    }

    public final void setDisableEmojiVariations(boolean z10) {
        this.f12659p = z10;
    }

    public final void setEnableDynamicText(boolean z10) {
        this.f12657n = z10;
        GPHSettings e10 = this.f12644a.getGifsAdapter().k().e();
        if (e10 == null) {
            return;
        }
        e10.g0(z10);
    }

    public final void setEnablePartnerProfiles(boolean z10) {
        this.f12658o = z10;
        GPHSettings e10 = this.f12644a.getGifsAdapter().k().e();
        if (e10 == null) {
            return;
        }
        e10.i0(z10);
    }

    public final void setFixedSizeCells(boolean z10) {
        this.f12662s = z10;
        this.f12644a.getGifsAdapter().k().s(z10);
    }

    public final void setGiphyLoadingProvider(@NotNull O8.n loadingProvider) {
        Intrinsics.checkNotNullParameter(loadingProvider, "loadingProvider");
        this.f12644a.getGifsAdapter().k().m(loadingProvider);
    }

    public final void setImageFormat(@NotNull Q8.e value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12654k = value;
        this.f12644a.getGifsAdapter().k().o(value);
    }

    public final void setRenditionType(@Nullable RenditionType renditionType) {
        this.f12655l = renditionType;
        this.f12644a.getGifsAdapter().k().q(renditionType);
    }

    public final void setSearchCallback(@Nullable A a10) {
        this.f12648e = a10;
    }

    public final void setShowCheckeredBackground(boolean z10) {
        this.f12653j = z10;
        this.f12644a.getGifsAdapter().k().r(z10);
    }

    public final void setShowViewOnGiphy(boolean z10) {
        this.f12660q = z10;
        C1741w c1741w = this.f12645b;
        if (c1741w == null) {
            return;
        }
        c1741w.v(z10);
    }

    public final void setSpanCount(int i10) {
        this.f12652i = i10;
        j();
    }

    public final void setTheme(@NotNull S8.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f12661r = value;
        O8.k.f8390a.o(value.b(getContext()));
    }

    public final void setUseInExtensionMode(boolean z10) {
        this.f12663t = z10;
    }

    public final void t(T8.l lVar, int i10) {
        View view;
        C1741w c1741w;
        Object a10 = lVar.a();
        Media media = a10 instanceof Media ? (Media) a10 : null;
        if (media == null) {
            return;
        }
        C1741w c1741w2 = new C1741w(getContext(), media, Intrinsics.areEqual(this.f12650g, GPHContent.f31771h.getRecents()), this.f12660q);
        this.f12645b = c1741w2;
        c1741w2.setFocusable(true);
        C1741w c1741w3 = this.f12645b;
        if (c1741w3 != null) {
            c1741w3.u(new j(this));
        }
        C1741w c1741w4 = this.f12645b;
        if (c1741w4 != null) {
            c1741w4.s(new k(this));
        }
        C1741w c1741w5 = this.f12645b;
        if (c1741w5 != null) {
            c1741w5.t(new l(media, lVar, i10));
        }
        this.f12644a.getGifTrackingManager$giphy_ui_2_3_17_release().h(media, ActionType.LONGPRESS);
        RecyclerView.F e02 = this.f12644a.e0(i10);
        if (e02 == null || (view = e02.itemView) == null || (c1741w = this.f12645b) == null) {
            return;
        }
        c1741w.showAsDropDown(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12649f = 1;
        this.f12651h = 10;
        this.f12652i = 2;
        this.f12653j = true;
        this.f12654k = Q8.e.WEBP;
        this.f12660q = true;
        S8.c cVar = S8.c.Automatic;
        this.f12661r = cVar;
        O8.k.f8390a.o(cVar.b(context));
        T8.k kVar = new T8.k(context, null, 0, 6, null);
        kVar.setId(O8.s.f8524x);
        kVar.getGifsAdapter().k().n(new GPHSettings(null, null, false, false, null, null, null, null, false, 0, null, false, false, false, false, null, false, 0.0f, false, false, 1048575, null));
        this.f12644a = kVar;
        this.f12644a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f12644a);
        setSaveEnabled(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O8.w.GiphyGridView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…able.GiphyGridView, 0, 0)");
        setSpanCount(obtainStyledAttributes.getInteger(O8.w.f8574g, this.f12652i));
        setCellPadding(obtainStyledAttributes.getDimensionPixelSize(O8.w.f8571d, this.f12651h));
        setDirection(obtainStyledAttributes.getInteger(O8.w.f8572e, this.f12649f));
        setShowCheckeredBackground(obtainStyledAttributes.getBoolean(O8.w.f8573f, this.f12653j));
        this.f12663t = obtainStyledAttributes.getBoolean(O8.w.f8575h, this.f12663t);
        obtainStyledAttributes.recycle();
        s();
    }

    public static /* synthetic */ void getClipsPreviewRenditionType$annotations() {
    }

    public static /* synthetic */ void getDisableEmojiVariations$annotations() {
    }

    public static /* synthetic */ void getEnableDynamicText$annotations() {
    }

    public static /* synthetic */ void getEnablePartnerProfiles$annotations() {
    }
}
