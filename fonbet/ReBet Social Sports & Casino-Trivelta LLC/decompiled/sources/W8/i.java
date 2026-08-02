package W8;

import V8.U;
import V8.a0;
import W8.a;
import androidx.recyclerview.widget.RecyclerView;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.pagination.GPHContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GPHContentType.values().length];
            try {
                iArr[GPHContentType.emoji.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GPHContentType.recents.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W8.a f13134a;

        public b(W8.a aVar) {
            this.f13134a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i10 == 1) {
                a0 searchBar$giphy_ui_2_3_17_release = this.f13134a.getSearchBar$giphy_ui_2_3_17_release();
                if (searchBar$giphy_ui_2_3_17_release != null) {
                    searchBar$giphy_ui_2_3_17_release.I();
                    return;
                }
                return;
            }
            if (i10 != 0 || recyclerView.computeVerticalScrollOffset() >= this.f13134a.getShowMediaScrollThreshold$giphy_ui_2_3_17_release()) {
                return;
            }
            o.e(this.f13134a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (recyclerView.computeVerticalScrollOffset() < this.f13134a.getShowMediaScrollThreshold$giphy_ui_2_3_17_release() && (recyclerView.getScrollState() == 2 || recyclerView.getScrollState() == 0)) {
                o.e(this.f13134a);
            } else {
                if (this.f13134a.getGiphySettings$giphy_ui_2_3_17_release().getSuggestionsBarFixedPosition()) {
                    return;
                }
                o.b(this.f13134a);
            }
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, r.class, "updateResultsCount", "updateResultsCount(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;I)V", 1);
        }

        public final void a(int i10) {
            r.e((W8.a) this.receiver, i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2 {
        public d(Object obj) {
            super(2, obj, W8.b.class, "onGifSelected", "onGifSelected(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/universallist/SmartItemData;I)V", 1);
        }

        public final void a(T8.l p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            W8.b.c((W8.a) this.receiver, p02, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((T8.l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function2 {
        public e(Object obj) {
            super(2, obj, W8.b.class, "onGifPressed", "onGifPressed(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/universallist/SmartItemData;I)V", 1);
        }

        public final void a(T8.l p02, int i10) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            W8.b.b((W8.a) this.receiver, p02, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((T8.l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
        public f(Object obj) {
            super(1, obj, W8.b.class, "onUserProfileInfoPressed", "onUserProfileInfoPressed(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/universallist/SmartItemData;)V", 1);
        }

        public final void a(T8.l p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            W8.b.f((W8.a) this.receiver, p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T8.l) obj);
            return Unit.INSTANCE;
        }
    }

    public static final b a(W8.a aVar) {
        return new b(aVar);
    }

    public static final void b(W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        r.c(aVar);
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setRenditionType(aVar.getGiphySettings$giphy_ui_2_3_17_release().getRenditionType());
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setClipsPreviewRenditionType(aVar.getGiphySettings$giphy_ui_2_3_17_release().getClipsPreviewRenditionType());
        T8.k gifsRecyclerView$giphy_ui_2_3_17_release = aVar.getGifsRecyclerView$giphy_ui_2_3_17_release();
        int i10 = a.$EnumSwitchMapping$0[aVar.getContentType$giphy_ui_2_3_17_release().ordinal()];
        gifsRecyclerView$giphy_ui_2_3_17_release.l2(i10 != 1 ? i10 != 2 ? GPHContent.f31771h.trending(aVar.getContentType$giphy_ui_2_3_17_release().b(), aVar.getGiphySettings$giphy_ui_2_3_17_release().getRating()) : GPHContent.f31771h.getRecents() : GPHContent.f31771h.getEmoji());
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setOnResultsUpdateListener(new c(aVar));
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setOnItemSelectedListener(new d(aVar));
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setOnItemLongPressListener(new e(aVar));
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setOnUserProfileInfoPressListener(new f(aVar));
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().n(a(aVar));
    }

    public static final void c(W8.a aVar, String str) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setQuery$giphy_ui_2_3_17_release(str);
        o.f(aVar);
        if (str == null || str.length() == 0) {
            T8.k gifsRecyclerView$giphy_ui_2_3_17_release = aVar.getGifsRecyclerView$giphy_ui_2_3_17_release();
            int i10 = a.$EnumSwitchMapping$0[aVar.getContentType$giphy_ui_2_3_17_release().ordinal()];
            gifsRecyclerView$giphy_ui_2_3_17_release.l2(i10 != 1 ? i10 != 2 ? GPHContent.f31771h.trending(aVar.getContentType$giphy_ui_2_3_17_release().b(), aVar.getGiphySettings$giphy_ui_2_3_17_release().getRating()) : GPHContent.f31771h.getRecents() : GPHContent.f31771h.getEmoji());
            return;
        }
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.text && aVar.getTextState$giphy_ui_2_3_17_release() == U.c.Create) {
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().l2(GPHContent.f31771h.animate(str));
        } else {
            aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().l2(GPHContent.f31771h.searchQuery(str, aVar.getContentType$giphy_ui_2_3_17_release().b(), aVar.getGiphySettings$giphy_ui_2_3_17_release().getRating()));
        }
        a.b listener = aVar.getListener();
        if (listener != null) {
            listener.d(str);
        }
    }
}
