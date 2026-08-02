package T8;

import O8.q;
import O8.u;
import R8.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.B;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.h;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Meta;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.core.network.response.ErrorResponse;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import com.giphy.sdk.ui.pagination.GPHContent;
import com.giphy.sdk.ui.universallist.WrapStaggeredGridLayoutManager;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class k extends RecyclerView {

    /* renamed from: A5, reason: collision with root package name */
    public GPHContentType f11296A5;

    /* renamed from: B5, reason: collision with root package name */
    public Function1 f11297B5;

    /* renamed from: C5, reason: collision with root package name */
    public Function2 f11298C5;

    /* renamed from: D5, reason: collision with root package name */
    public boolean f11299D5;

    /* renamed from: E5, reason: collision with root package name */
    public B f11300E5;

    /* renamed from: F5, reason: collision with root package name */
    public B f11301F5;

    /* renamed from: G5, reason: collision with root package name */
    public Future f11302G5;

    /* renamed from: H5, reason: collision with root package name */
    public final T8.g f11303H5;

    /* renamed from: I5, reason: collision with root package name */
    public boolean f11304I5;

    /* renamed from: r5, reason: collision with root package name */
    public ArrayList f11305r5;

    /* renamed from: s5, reason: collision with root package name */
    public ArrayList f11306s5;

    /* renamed from: t5, reason: collision with root package name */
    public ArrayList f11307t5;

    /* renamed from: u5, reason: collision with root package name */
    public K8.k f11308u5;

    /* renamed from: v5, reason: collision with root package name */
    public GPHContent f11309v5;

    /* renamed from: w5, reason: collision with root package name */
    public N8.c f11310w5;

    /* renamed from: x5, reason: collision with root package name */
    public int f11311x5;

    /* renamed from: y5, reason: collision with root package name */
    public int f11312y5;

    /* renamed from: z5, reason: collision with root package name */
    public int f11313z5;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GPHContentType.values().length];
            try {
                iArr[GPHContentType.emoji.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11314a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f11315b;

        public b(int i10, k kVar) {
            this.f11314a = i10;
            this.f11315b = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            int e10 = ((GridLayoutManager.c) layoutParams).e();
            int cellPadding = (e10 != 0 || this.f11314a >= 3) ? this.f11315b.getCellPadding() / 2 : 0;
            int i10 = this.f11314a;
            outRect.set(cellPadding, 0, (e10 != i10 + (-1) || i10 >= 3) ? this.f11315b.getCellPadding() / 2 : 0, this.f11315b.getCellPadding());
        }
    }

    public static final class c extends RecyclerView.p {

        /* renamed from: a, reason: collision with root package name */
        public final int f11316a;

        public c() {
            this.f11316a = k.this.getCellPadding();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.B state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            RecyclerView.h adapter = parent.getAdapter();
            boolean z10 = adapter != null && adapter.getItemViewType(parent.m0(view)) == m.f11334f.ordinal();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            int e10 = ((StaggeredGridLayoutManager.c) layoutParams).e();
            outRect.set(((e10 != 0 || k.this.getSpanCount() >= 3) && !z10) ? this.f11316a / 2 : 0, 0, ((e10 != k.this.getSpanCount() - 1 || k.this.getSpanCount() >= 3) && !z10) ? this.f11316a / 2 : 0, this.f11316a);
        }
    }

    public static final class d extends h.f {
        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(l oldItem, l newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.d() == newItem.d() && Intrinsics.areEqual(oldItem.a(), newItem.a());
        }

        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(l oldItem, l newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.d() == newItem.d() && Intrinsics.areEqual(oldItem.a(), newItem.a());
        }
    }

    public static final class e extends GridLayoutManager.d {
        public e() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            return k.this.getGifsAdapter().n(i10);
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
        public f(Object obj) {
            super(1, obj, k.class, "loadNextPage", "loadNextPage(I)V", 0);
        }

        public final void a(int i10) {
            ((k) this.receiver).e2(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            k.this.getGifTrackingManager$giphy_ui_2_3_17_release().i();
        }
    }

    public static final class h implements K8.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ R8.a f11321b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ O8.e f11322c;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MediaType.values().length];
                try {
                    iArr[MediaType.sticker.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MediaType.text.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MediaType.video.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final b f11323d = new b();

            public b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(l it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.d().ordinal() == m.f11334f.ordinal());
            }
        }

        public /* synthetic */ class c extends FunctionReferenceImpl implements Function0 {
            public c(Object obj) {
                super(0, obj, k.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m17invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m17invoke() {
                ((k) this.receiver).g2();
            }
        }

        public /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {
            public d(Object obj) {
                super(0, obj, k.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m18invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18invoke() {
                ((k) this.receiver).g2();
            }
        }

        public h(R8.a aVar, O8.e eVar) {
            this.f11321b = aVar;
            this.f11322c = eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
        
            if (kotlin.collections.CollectionsKt.contains(r4, r5 != null ? java.lang.Integer.valueOf(r5.getStatus()) : null) == false) goto L10;
         */
        @Override // K8.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(ListMediaResponse listMediaResponse, Throwable th2) {
            R8.a a10;
            Meta meta;
            String string;
            ErrorResponse a11;
            Meta meta2;
            String msg;
            List<Media> data;
            String str;
            Character firstOrNull;
            User user;
            List<Media> data2;
            boolean z10 = th2 instanceof L8.a;
            if (z10) {
                List listOf = CollectionsKt.listOf((Object[]) new Integer[]{422, Integer.valueOf(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP)});
                Meta meta3 = ((L8.a) th2).a().getMeta();
            }
            if ((listMediaResponse != null ? listMediaResponse.getData() : null) == null) {
                if (this.f11322c == O8.e.recents) {
                    k.this.getFooterItems().clear();
                    k.this.getFooterItems().add(new l(m.f11336h, k.this.getContext().getString(u.f8558l), k.this.getSpanCount()));
                    k.this.h2();
                    return;
                } else {
                    if (th2 != null) {
                        k kVar = k.this;
                        B networkState = kVar.getNetworkState();
                        Object value = kVar.getNetworkState().getValue();
                        a.C0193a c0193a = R8.a.f10089d;
                        if (Intrinsics.areEqual(value, c0193a.f())) {
                            a10 = c0193a.b(th2.getMessage());
                            a10.h(new c(kVar));
                        } else {
                            a10 = c0193a.a(th2.getMessage());
                            a10.h(new d(kVar));
                        }
                        networkState.setValue(a10);
                        kVar.o2();
                        kVar.h2();
                        return;
                    }
                    return;
                }
            }
            B networkState2 = k.this.getNetworkState();
            Object value2 = k.this.getNetworkState().getValue();
            a.C0193a c0193a2 = R8.a.f10089d;
            networkState2.setValue(Intrinsics.areEqual(value2, c0193a2.f()) ? c0193a2.d() : c0193a2.c());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadGifs ");
            sb2.append(this.f11321b);
            sb2.append(" newGifCount=");
            sb2.append((listMediaResponse == null || (data2 = listMediaResponse.getData()) == null) ? null : Integer.valueOf(data2.size()));
            timber.log.a.a(sb2.toString(), new Object[0]);
            k.this.getFooterItems().clear();
            if (listMediaResponse != null && (data = listMediaResponse.getData()) != null) {
                k kVar2 = k.this;
                O8.e eVar = this.f11322c;
                GPHSettings e10 = kVar2.getGifsAdapter().k().e();
                if (!(e10 != null ? e10.getEnableDynamicText() : false)) {
                    GPHContent gPHContent = kVar2.f11309v5;
                    if ((gPHContent != null ? gPHContent.j() : null) == MediaType.text && eVar == O8.e.search) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : data) {
                            if (!((Media) obj).getIsDynamic()) {
                                arrayList.add(obj);
                            }
                        }
                        data = arrayList;
                    }
                }
                boolean c22 = kVar2.c2(data);
                ArrayList<l> contentItems = kVar2.getContentItems();
                List<Media> list = data;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Media media : list) {
                    arrayList2.add(new l(c22 ? m.f11332d : media.getIsDynamic() ? m.f11333e : N8.j.c(media) ? m.f11330b : m.f11331c, media, 0, 4, null));
                }
                contentItems.addAll(arrayList2);
                GPHContent gPHContent2 = kVar2.f11309v5;
                if (gPHContent2 == null || (str = gPHContent2.l()) == null) {
                    str = "";
                }
                l lVar = (l) CollectionsKt.firstOrNull((List) kVar2.getContentItems());
                Object a12 = lVar != null ? lVar.a() : null;
                Media media2 = a12 instanceof Media ? (Media) a12 : null;
                User user2 = media2 != null ? media2.getUser() : null;
                ArrayList<l> contentItems2 = kVar2.getContentItems();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : contentItems2) {
                    Object a13 = ((l) obj2).a();
                    Media media3 = a13 instanceof Media ? (Media) a13 : null;
                    if (Intrinsics.areEqual((media3 == null || (user = media3.getUser()) == null) ? null : user.getUsername(), user2 != null ? user2.getUsername() : null)) {
                        arrayList3.add(obj2);
                    }
                }
                GPHSettings e11 = kVar2.getGifsAdapter().k().e();
                if ((e11 != null && e11.getEnablePartnerProfiles()) && (firstOrNull = StringsKt.firstOrNull(str)) != null && firstOrNull.charValue() == '@' && str.length() > 1 && kVar2.getContentItems().size() <= 25 && !kVar2.getContentItems().isEmpty() && user2 != null) {
                    if (Intrinsics.areEqual(str, '@' + user2.getUsername()) && arrayList3.size() == kVar2.getContentItems().size()) {
                        String displayName = user2.getDisplayName();
                        if (!(displayName == null || StringsKt.isBlank(displayName))) {
                            String avatarUrl = user2.getAvatarUrl();
                            if (!(avatarUrl == null || StringsKt.isBlank(avatarUrl))) {
                                CollectionsKt.removeAll((List) kVar2.getHeaderItems(), (Function1) b.f11323d);
                                kVar2.getHeaderItems().add(new l(m.f11334f, user2, kVar2.getSpanCount()));
                            }
                        }
                    }
                }
            }
            if (Intrinsics.areEqual(k.this.getNetworkState().getValue(), R8.a.f10089d.d()) && k.this.getContentItems().isEmpty()) {
                GPHContent gPHContent3 = k.this.f11309v5;
                MediaType j10 = gPHContent3 != null ? gPHContent3.j() : null;
                int i10 = j10 == null ? -1 : a.$EnumSwitchMapping$0[j10.ordinal()];
                if (i10 == 1) {
                    string = k.this.getContext().getString(u.f8559m);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_error_no_stickers_found)");
                } else if (i10 == 2) {
                    string = k.this.getContext().getString(u.f8560n);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…gph_error_no_texts_found)");
                } else if (i10 != 3) {
                    string = k.this.getContext().getString(u.f8557k);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri….gph_error_no_gifs_found)");
                } else {
                    string = k.this.getContext().getString(u.f8556j);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…gph_error_no_clips_found)");
                }
                ArrayList<l> footerItems = k.this.getFooterItems();
                m mVar = m.f11336h;
                L8.a aVar = z10 ? (L8.a) th2 : null;
                if (aVar != null && (a11 = aVar.a()) != null && (meta2 = a11.getMeta()) != null && (msg = meta2.getMsg()) != null) {
                    string = msg;
                }
                footerItems.add(new l(mVar, string, k.this.getSpanCount()));
            }
            if (listMediaResponse != null && (meta = listMediaResponse.getMeta()) != null) {
                k.this.getResponseId().setValue(meta.getResponseId());
            }
            k.this.h2();
        }
    }

    public static final class i extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function2 f11324d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f11325e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function2 function2, k kVar) {
            super(2);
            this.f11324d = function2;
            this.f11325e = kVar;
        }

        public final void a(l item, int i10) {
            Intrinsics.checkNotNullParameter(item, "item");
            Media b10 = item.b();
            if (b10 != null) {
                this.f11325e.getGifTrackingManager$giphy_ui_2_3_17_release().h(b10, ActionType.CLICK);
            }
            Function2 function2 = this.f11324d;
            if (function2 != null) {
                function2.invoke(item, Integer.valueOf(i10));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void f2(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f11299D5) {
            return;
        }
        GPHContent gPHContent = this$0.f11309v5;
        if (gPHContent == null || gPHContent.i()) {
            Object value = this$0.f11300E5.getValue();
            a.C0193a c0193a = R8.a.f10089d;
            if ((Intrinsics.areEqual(value, c0193a.c()) || Intrinsics.areEqual(this$0.f11300E5.getValue(), c0193a.d())) && !this$0.f11306s5.isEmpty()) {
                this$0.d2(c0193a.e());
            }
        }
    }

    private final d getPostComparator() {
        return new d();
    }

    private final e getSpanSizeLookup() {
        return new e();
    }

    public static final void i2(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11299D5 = false;
        int size = this$0.f11306s5.size();
        if (this$0.f11306s5.isEmpty()) {
            l lVar = (l) CollectionsKt.firstOrNull((List) this$0.f11307t5);
            if ((lVar != null ? lVar.d() : null) == m.f11335g) {
                size = -1;
            }
        }
        this$0.f11297B5.invoke(Integer.valueOf(size));
        this$0.f11310w5.i();
    }

    public static final void j2(k this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f11304I5 = false;
        this$0.layout(this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
        this$0.onLayout(false, this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
    }

    public final void X1() {
        this.f11306s5.clear();
        this.f11305r5.clear();
        this.f11307t5.clear();
        this.f11303H5.e(null);
    }

    public final void Y1() {
        timber.log.a.a("configureRecyclerViewForGridType", new Object[0]);
        GPHContentType gPHContentType = this.f11296A5;
        if ((gPHContentType == null ? -1 : a.$EnumSwitchMapping$0[gPHContentType.ordinal()]) == 1) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), this.f11312y5, this.f11311x5, false);
            gridLayoutManager.G3(getSpanSizeLookup());
            setLayoutManager(gridLayoutManager);
        } else {
            setLayoutManager(new WrapStaggeredGridLayoutManager(this.f11312y5, this.f11311x5));
        }
        n2();
    }

    public final RecyclerView.p Z1(int i10) {
        return new b(i10, this);
    }

    public final RecyclerView.p a2() {
        return new c();
    }

    public final boolean b2() {
        ArrayList arrayList = this.f11306s5;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object a10 = ((l) it.next()).a();
            Media media = a10 instanceof Media ? (Media) a10 : null;
            if (media != null) {
                arrayList2.add(media);
            }
        }
        return c2(arrayList2);
    }

    public final boolean c2(List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (!((Media) it.next()).getIsDynamic()) {
                break;
            }
            i10++;
        }
        return i10 == -1;
    }

    public final void d2(R8.a aVar) {
        GPHContent t10;
        timber.log.a.a("loadGifs " + aVar.g(), new Object[0]);
        this.f11300E5.setValue(aVar);
        o2();
        Future future = null;
        if (Intrinsics.areEqual(aVar, R8.a.f10089d.f())) {
            this.f11306s5.clear();
            Future future2 = this.f11302G5;
            if (future2 != null) {
                future2.cancel(true);
            }
            this.f11302G5 = null;
        }
        timber.log.a.a("loadGifs " + aVar + " offset=" + this.f11306s5.size(), new Object[0]);
        this.f11299D5 = true;
        GPHContent gPHContent = this.f11309v5;
        O8.e k10 = gPHContent != null ? gPHContent.k() : null;
        Future future3 = this.f11302G5;
        if (future3 != null) {
            future3.cancel(true);
        }
        GPHContent gPHContent2 = this.f11309v5;
        if (gPHContent2 != null && (t10 = gPHContent2.t(this.f11308u5)) != null) {
            future = t10.n(this.f11306s5.size(), new h(aVar, k10));
        }
        this.f11302G5 = future;
    }

    public final void e2(int i10) {
        timber.log.a.a("loadNextPage aroundPosition=" + i10, new Object[0]);
        post(new Runnable() { // from class: T8.h
            @Override // java.lang.Runnable
            public final void run() {
                k.f2(k.this);
            }
        });
    }

    public final void g2() {
        GPHContent gPHContent = this.f11309v5;
        if (gPHContent != null) {
            l2(gPHContent);
        }
    }

    @NotNull
    public final K8.k getApiClient$giphy_ui_2_3_17_release() {
        return this.f11308u5;
    }

    public final int getCellPadding() {
        return this.f11313z5;
    }

    @Nullable
    public final RenditionType getClipsPreviewRenditionType() {
        return this.f11303H5.k().b();
    }

    @NotNull
    public final ArrayList<l> getContentItems() {
        return this.f11306s5;
    }

    @NotNull
    public final ArrayList<l> getFooterItems() {
        return this.f11307t5;
    }

    @NotNull
    public final N8.c getGifTrackingManager$giphy_ui_2_3_17_release() {
        return this.f11310w5;
    }

    @NotNull
    public final T8.g getGifsAdapter() {
        return this.f11303H5;
    }

    @NotNull
    public final ArrayList<l> getHeaderItems() {
        return this.f11305r5;
    }

    @NotNull
    public final B getNetworkState() {
        return this.f11300E5;
    }

    @NotNull
    public final Function2<l, Integer, Unit> getOnItemLongPressListener() {
        return this.f11303H5.l();
    }

    @Nullable
    public final Function2<l, Integer, Unit> getOnItemSelectedListener() {
        return this.f11303H5.m();
    }

    @NotNull
    public final Function1<Integer, Unit> getOnResultsUpdateListener() {
        return this.f11297B5;
    }

    @NotNull
    public final Function1<l, Unit> getOnUserProfileInfoPressListener() {
        return this.f11303H5.p();
    }

    public final int getOrientation() {
        return this.f11311x5;
    }

    @Nullable
    public final RenditionType getRenditionType() {
        return this.f11303H5.k().h();
    }

    @NotNull
    public final B getResponseId() {
        return this.f11301F5;
    }

    public final int getSpanCount() {
        return this.f11312y5;
    }

    public final void h2() {
        timber.log.a.a("refreshItems " + this.f11305r5.size() + ' ' + this.f11306s5.size() + ' ' + this.f11307t5.size(), new Object[0]);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11305r5);
        arrayList.addAll(this.f11306s5);
        arrayList.addAll(this.f11307t5);
        this.f11303H5.f(arrayList, new Runnable() { // from class: T8.j
            @Override // java.lang.Runnable
            public final void run() {
                k.i2(k.this);
            }
        });
    }

    public final void k2(Integer num, GPHContentType contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f11296A5 = contentType;
        this.f11303H5.k().l(contentType);
        int i10 = 4;
        if (getResources().getConfiguration().orientation != 2 && (getResources().getConfiguration().screenLayout & 15) != 4) {
            i10 = 2;
        }
        if (num != null) {
            i10 = num.intValue();
        }
        if (contentType == GPHContentType.emoji) {
            i10 = num != null ? num.intValue() : 5;
        }
        setOrientation(1);
        setSpanCount(i10);
    }

    public final void l2(GPHContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        X1();
        this.f11310w5.g();
        this.f11309v5 = content;
        this.f11303H5.z(content.j());
        d2(R8.a.f10089d.f());
    }

    public final void m2() {
        RecyclerView.q layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z10 = true;
        boolean z11 = (linearLayoutManager == null || this.f11311x5 == linearLayoutManager.B2()) ? false : true;
        RecyclerView.q layoutManager2 = getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
        if (gridLayoutManager != null) {
            z11 = this.f11312y5 != gridLayoutManager.x3();
        }
        RecyclerView.q layoutManager3 = getLayoutManager();
        WrapStaggeredGridLayoutManager wrapStaggeredGridLayoutManager = layoutManager3 instanceof WrapStaggeredGridLayoutManager ? (WrapStaggeredGridLayoutManager) layoutManager3 : null;
        if (wrapStaggeredGridLayoutManager != null) {
            if (this.f11311x5 == wrapStaggeredGridLayoutManager.E2() && this.f11312y5 == wrapStaggeredGridLayoutManager.F2()) {
                z10 = false;
            }
            z11 = z10;
        }
        timber.log.a.a("updateGridTypeIfNeeded requiresUpdate=" + z11, new Object[0]);
        if (z11) {
            Y1();
        }
    }

    public final void n2() {
        while (getItemDecorationCount() > 0) {
            l1(0);
        }
        GPHContentType gPHContentType = this.f11296A5;
        if ((gPHContentType == null ? -1 : a.$EnumSwitchMapping$0[gPHContentType.ordinal()]) == 1) {
            j(Z1(this.f11312y5));
        } else {
            j(a2());
        }
    }

    public final void o2() {
        timber.log.a.a("updateNetworkState", new Object[0]);
        this.f11307t5.clear();
        this.f11307t5.add(new l(m.f11335g, this.f11300E5.getValue(), this.f11312y5));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f11304I5) {
            return;
        }
        this.f11304I5 = true;
        post(new Runnable() { // from class: T8.i
            @Override // java.lang.Runnable
            public final void run() {
                k.j2(k.this);
            }
        });
    }

    public final void setApiClient$giphy_ui_2_3_17_release(@NotNull K8.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f11308u5 = kVar;
    }

    public final void setCellPadding(int i10) {
        this.f11313z5 = i10;
        n2();
    }

    public final void setClipsPreviewRenditionType(@Nullable RenditionType renditionType) {
        this.f11303H5.k().k(renditionType);
    }

    public final void setContentItems(@NotNull ArrayList<l> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f11306s5 = arrayList;
    }

    public final void setFooterItems(@NotNull ArrayList<l> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f11307t5 = arrayList;
    }

    public final void setGifTrackingManager$giphy_ui_2_3_17_release(@NotNull N8.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f11310w5 = cVar;
    }

    public final void setHeaderItems(@NotNull ArrayList<l> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f11305r5 = arrayList;
    }

    public final void setNetworkState(@NotNull B b10) {
        Intrinsics.checkNotNullParameter(b10, "<set-?>");
        this.f11300E5 = b10;
    }

    public final void setOnItemLongPressListener(@NotNull Function2<? super l, ? super Integer, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f11303H5.w(value);
    }

    public final void setOnItemSelectedListener(@Nullable Function2<? super l, ? super Integer, Unit> function2) {
        this.f11298C5 = function2;
        this.f11303H5.x(new i(function2, this));
    }

    public final void setOnResultsUpdateListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f11297B5 = function1;
    }

    public final void setOnUserProfileInfoPressListener(@NotNull Function1<? super l, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f11303H5.B(value);
    }

    public final void setOrientation(int i10) {
        this.f11311x5 = i10;
        m2();
    }

    public final void setRenditionType(@Nullable RenditionType renditionType) {
        this.f11303H5.k().q(renditionType);
    }

    public final void setResponseId(@NotNull B b10) {
        Intrinsics.checkNotNullParameter(b10, "<set-?>");
        this.f11301F5 = b10;
    }

    public final void setSpanCount(int i10) {
        this.f11312y5 = i10;
        m2();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11305r5 = new ArrayList();
        this.f11306s5 = new ArrayList();
        this.f11307t5 = new ArrayList();
        this.f11308u5 = J8.d.f5962a.d();
        this.f11310w5 = new N8.c(true, 0, 0, 6, null);
        this.f11311x5 = 1;
        this.f11312y5 = 2;
        this.f11313z5 = -1;
        this.f11297B5 = j.f11326d;
        this.f11300E5 = new B();
        this.f11301F5 = new B();
        T8.g gVar = new T8.g(context, getPostComparator());
        gVar.y(new f(this));
        gVar.A(new g());
        this.f11303H5 = gVar;
        if (this.f11313z5 == -1) {
            setCellPadding(getResources().getDimensionPixelSize(q.f8403b));
        }
        Y1();
        setAdapter(gVar);
        this.f11310w5.b(this, gVar);
    }

    public static final class j extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f11326d = new j();

        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void a(int i10) {
        }
    }
}
