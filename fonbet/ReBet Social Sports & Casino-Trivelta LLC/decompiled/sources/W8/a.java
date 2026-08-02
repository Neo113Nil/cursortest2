package W8;

import V8.C1741w;
import V8.C1743y;
import V8.D;
import V8.E;
import V8.U;
import V8.a0;
import V8.b0;
import V8.f0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import java.util.HashMap;
import java.util.concurrent.Future;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class a extends FrameLayout {

    /* renamed from: y1, reason: collision with root package name */
    public static final C0272a f13080y1 = new C0272a(null);

    /* renamed from: A, reason: collision with root package name */
    public View f13081A;

    /* renamed from: B, reason: collision with root package name */
    public P8.i f13082B;

    /* renamed from: C, reason: collision with root package name */
    public U8.b f13083C;

    /* renamed from: D, reason: collision with root package name */
    public final androidx.constraintlayout.widget.d f13084D;

    /* renamed from: E, reason: collision with root package name */
    public final androidx.constraintlayout.widget.d f13085E;

    /* renamed from: F, reason: collision with root package name */
    public final androidx.constraintlayout.widget.d f13086F;

    /* renamed from: G, reason: collision with root package name */
    public final ValueAnimator f13087G;

    /* renamed from: H, reason: collision with root package name */
    public final ValueAnimator f13088H;

    /* renamed from: I, reason: collision with root package name */
    public GPHContentType f13089I;

    /* renamed from: J, reason: collision with root package name */
    public U.c f13090J;

    /* renamed from: K, reason: collision with root package name */
    public GPHContentType f13091K;

    /* renamed from: L, reason: collision with root package name */
    public String f13092L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f13093O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f13094P;

    /* renamed from: R, reason: collision with root package name */
    public O8.i f13095R;

    /* renamed from: T, reason: collision with root package name */
    public boolean f13096T;

    /* renamed from: V, reason: collision with root package name */
    public O8.d f13097V;

    /* renamed from: W, reason: collision with root package name */
    public b f13098W;

    /* renamed from: a, reason: collision with root package name */
    public U.d f13099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13100b;

    /* renamed from: b1, reason: collision with root package name */
    public Future f13101b1;

    /* renamed from: c, reason: collision with root package name */
    public final int f13102c;

    /* renamed from: d, reason: collision with root package name */
    public int f13103d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13104e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13105f;

    /* renamed from: g, reason: collision with root package name */
    public int f13106g;

    /* renamed from: g1, reason: collision with root package name */
    public C1741w f13107g1;

    /* renamed from: h, reason: collision with root package name */
    public int f13108h;

    /* renamed from: i, reason: collision with root package name */
    public int f13109i;

    /* renamed from: j, reason: collision with root package name */
    public int f13110j;

    /* renamed from: k, reason: collision with root package name */
    public GPHSettings f13111k;

    /* renamed from: l, reason: collision with root package name */
    public String f13112l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f13113m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f13114n;

    /* renamed from: o, reason: collision with root package name */
    public E f13115o;

    /* renamed from: p, reason: collision with root package name */
    public b0 f13116p;

    /* renamed from: p1, reason: collision with root package name */
    public f0 f13117p1;

    /* renamed from: q, reason: collision with root package name */
    public b0 f13118q;

    /* renamed from: r, reason: collision with root package name */
    public a0 f13119r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f13120s;

    /* renamed from: t, reason: collision with root package name */
    public ConstraintLayout f13121t;

    /* renamed from: u, reason: collision with root package name */
    public T8.k f13122u;

    /* renamed from: v, reason: collision with root package name */
    public C1743y f13123v;

    /* renamed from: w, reason: collision with root package name */
    public D f13124w;

    /* renamed from: x, reason: collision with root package name */
    public View f13125x;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f13126x1;

    /* renamed from: y, reason: collision with root package name */
    public View f13127y;

    /* renamed from: z, reason: collision with root package name */
    public P8.b f13128z;

    /* renamed from: W8.a$a, reason: collision with other inner class name */
    public static final class C0272a {
        public /* synthetic */ C0272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0272a() {
        }
    }

    public interface b {
        void a(Media media, String str, GPHContentType gPHContentType);

        void b();

        void c(GPHContentType gPHContentType);

        void d(String str);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void a(Media media) {
        Intrinsics.checkNotNullParameter(media, "media");
        b bVar = this.f13098W;
        if (bVar != null) {
            bVar.a(media, this.f13092L, this.f13089I);
        }
    }

    public final boolean b() {
        return this.f13093O;
    }

    public final boolean c() {
        return this.f13094P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        this.f13126x1 = true;
        super.dispatchSaveInstanceState(sparseArray);
    }

    public final ValueAnimator getAttributionAnimator$giphy_ui_2_3_17_release() {
        return this.f13087G;
    }

    @Nullable
    public final View getAttributionView$giphy_ui_2_3_17_release() {
        return this.f13127y;
    }

    @Nullable
    public final P8.b getAttributionViewBinding$giphy_ui_2_3_17_release() {
        return this.f13128z;
    }

    @NotNull
    public final b0 getBaseView$giphy_ui_2_3_17_release() {
        b0 b0Var = this.f13116p;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseView");
        return null;
    }

    @NotNull
    public final b0 getBaseViewOverlay$giphy_ui_2_3_17_release() {
        b0 b0Var = this.f13118q;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseViewOverlay");
        return null;
    }

    @NotNull
    public final GPHContentType getBrowseContentType$giphy_ui_2_3_17_release() {
        return this.f13091K;
    }

    public final boolean getCanShowSuggestions$giphy_ui_2_3_17_release() {
        return this.f13096T;
    }

    @NotNull
    public final androidx.constraintlayout.widget.d getContainerConstraints$giphy_ui_2_3_17_release() {
        return this.f13084D;
    }

    @NotNull
    public final E getContainerView$giphy_ui_2_3_17_release() {
        E e10 = this.f13115o;
        if (e10 != null) {
            return e10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("containerView");
        return null;
    }

    @NotNull
    public final GPHContentType getContentType$giphy_ui_2_3_17_release() {
        return this.f13089I;
    }

    @Nullable
    public final Future<?> getFetchEmojiVariationsJob$giphy_ui_2_3_17_release() {
        return this.f13101b1;
    }

    public final int getFragmentElevation$giphy_ui_2_3_17_release() {
        return this.f13105f;
    }

    @NotNull
    public final T8.k getGifsRecyclerView$giphy_ui_2_3_17_release() {
        T8.k kVar = this.f13122u;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gifsRecyclerView");
        return null;
    }

    @Nullable
    public final String getGiphyApiKey$giphy_ui_2_3_17_release() {
        return this.f13112l;
    }

    @NotNull
    public final GPHSettings getGiphySettings$giphy_ui_2_3_17_release() {
        GPHSettings gPHSettings = this.f13111k;
        if (gPHSettings != null) {
            return gPHSettings;
        }
        Intrinsics.throwUninitializedPropertyAccessException("giphySettings");
        return null;
    }

    @Nullable
    public final Boolean getGiphyVerificationMode$giphy_ui_2_3_17_release() {
        return this.f13114n;
    }

    @NotNull
    public final O8.i getGphSuggestions$giphy_ui_2_3_17_release() {
        O8.i iVar = this.f13095R;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gphSuggestions");
        return null;
    }

    @Nullable
    public final b getListener() {
        return this.f13098W;
    }

    public final int getMarginBottom$giphy_ui_2_3_17_release() {
        return this.f13109i;
    }

    @Nullable
    public final C1741w getMediaPreview$giphy_ui_2_3_17_release() {
        return this.f13107g1;
    }

    public final int getMediaSelectorHeight$giphy_ui_2_3_17_release() {
        return this.f13103d;
    }

    @Nullable
    public final C1743y getMediaSelectorView$giphy_ui_2_3_17_release() {
        return this.f13123v;
    }

    @NotNull
    public final HashMap<String, String> getMetadata$giphy_ui_2_3_17_release() {
        return this.f13113m;
    }

    @NotNull
    public final U.d getPKeyboardState$giphy_ui_2_3_17_release() {
        return this.f13099a;
    }

    @Nullable
    public final String getQuery$giphy_ui_2_3_17_release() {
        return this.f13092L;
    }

    @NotNull
    public final O8.d getRecentSearches$giphy_ui_2_3_17_release() {
        O8.d dVar = this.f13097V;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recentSearches");
        return null;
    }

    @NotNull
    public final androidx.constraintlayout.widget.d getResultsConstraints$giphy_ui_2_3_17_release() {
        return this.f13085E;
    }

    @Nullable
    public final ImageView getSearchBackButton$giphy_ui_2_3_17_release() {
        return this.f13120s;
    }

    @Nullable
    public final a0 getSearchBar$giphy_ui_2_3_17_release() {
        return this.f13119r;
    }

    @NotNull
    public final androidx.constraintlayout.widget.d getSearchBarConstrains$giphy_ui_2_3_17_release() {
        return this.f13086F;
    }

    @NotNull
    public final ConstraintLayout getSearchBarContainer$giphy_ui_2_3_17_release() {
        ConstraintLayout constraintLayout = this.f13121t;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("searchBarContainer");
        return null;
    }

    public final int getSearchBarMargin$giphy_ui_2_3_17_release() {
        return this.f13110j;
    }

    public final int getSearchBarMarginBottom$giphy_ui_2_3_17_release() {
        return this.f13108h;
    }

    public final int getSearchBarMarginTop$giphy_ui_2_3_17_release() {
        return this.f13106g;
    }

    public final int getShowMediaScrollThreshold$giphy_ui_2_3_17_release() {
        return this.f13102c;
    }

    public final int getSuggestionsHeight$giphy_ui_2_3_17_release() {
        return this.f13104e;
    }

    @Nullable
    public final View getSuggestionsPlaceholderView$giphy_ui_2_3_17_release() {
        return this.f13125x;
    }

    @Nullable
    public final D getSuggestionsView$giphy_ui_2_3_17_release() {
        return this.f13124w;
    }

    public final int getTextSpanCount$giphy_ui_2_3_17_release() {
        return this.f13100b;
    }

    @NotNull
    public final U.c getTextState$giphy_ui_2_3_17_release() {
        return this.f13090J;
    }

    @Nullable
    public final f0 getUserProfileInfoDialog$giphy_ui_2_3_17_release() {
        return this.f13117p1;
    }

    public final ValueAnimator getVideoAttributionAnimator$giphy_ui_2_3_17_release() {
        return this.f13088H;
    }

    @Nullable
    public final View getVideoAttributionView$giphy_ui_2_3_17_release() {
        return this.f13081A;
    }

    @Nullable
    public final P8.i getVideoAttributionViewBinding$giphy_ui_2_3_17_release() {
        return this.f13082B;
    }

    @Nullable
    public final U8.b getVideoPlayer$giphy_ui_2_3_17_release() {
        return this.f13083C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.f(this, this);
        i.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        U8.b bVar = this.f13083C;
        if (bVar != null) {
            bVar.n();
        }
        if (!this.f13126x1) {
            getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().g();
        }
        this.f13087G.cancel();
        this.f13088H.cancel();
        this.f13087G.removeAllUpdateListeners();
        this.f13087G.removeAllListeners();
        this.f13088H.removeAllUpdateListeners();
        this.f13088H.removeAllListeners();
        this.f13127y = null;
        this.f13081A = null;
        a0 a0Var = this.f13119r;
        if (a0Var != null) {
            a0Var.J();
        }
        ImageView imageView = this.f13120s;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        getContainerView$giphy_ui_2_3_17_release().removeAllViews();
        this.f13128z = null;
        b bVar2 = this.f13098W;
        if (bVar2 != null) {
            bVar2.c(this.f13089I);
        }
        super.onDetachedFromWindow();
    }

    public final void setAttributionView$giphy_ui_2_3_17_release(@Nullable View view) {
        this.f13127y = view;
    }

    public final void setAttributionViewBinding$giphy_ui_2_3_17_release(@Nullable P8.b bVar) {
        this.f13128z = bVar;
    }

    public final void setAttributionVisible$giphy_ui_2_3_17_release(boolean z10) {
        this.f13093O = z10;
    }

    public final void setBaseView$giphy_ui_2_3_17_release(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f13116p = b0Var;
    }

    public final void setBaseViewOverlay$giphy_ui_2_3_17_release(@NotNull b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f13118q = b0Var;
    }

    public final void setBrowseContentType$giphy_ui_2_3_17_release(@NotNull GPHContentType gPHContentType) {
        Intrinsics.checkNotNullParameter(gPHContentType, "<set-?>");
        this.f13091K = gPHContentType;
    }

    public final void setCanShowSuggestions$giphy_ui_2_3_17_release(boolean z10) {
        this.f13096T = z10;
    }

    public final void setContainerView$giphy_ui_2_3_17_release(@NotNull E e10) {
        Intrinsics.checkNotNullParameter(e10, "<set-?>");
        this.f13115o = e10;
    }

    public final void setContentType$giphy_ui_2_3_17_release(@NotNull GPHContentType gPHContentType) {
        Intrinsics.checkNotNullParameter(gPHContentType, "<set-?>");
        this.f13089I = gPHContentType;
    }

    public final void setFetchEmojiVariationsJob$giphy_ui_2_3_17_release(@Nullable Future<?> future) {
        this.f13101b1 = future;
    }

    public final void setGifsRecyclerView$giphy_ui_2_3_17_release(@NotNull T8.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f13122u = kVar;
    }

    public final void setGiphyApiKey$giphy_ui_2_3_17_release(@Nullable String str) {
        this.f13112l = str;
    }

    public final void setGiphySettings$giphy_ui_2_3_17_release(@NotNull GPHSettings gPHSettings) {
        Intrinsics.checkNotNullParameter(gPHSettings, "<set-?>");
        this.f13111k = gPHSettings;
    }

    public final void setGiphyVerificationMode$giphy_ui_2_3_17_release(@Nullable Boolean bool) {
        this.f13114n = bool;
    }

    public final void setGphSuggestions$giphy_ui_2_3_17_release(@NotNull O8.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f13095R = iVar;
    }

    public final void setListener(@Nullable b bVar) {
        this.f13098W = bVar;
    }

    public final void setMarginBottom$giphy_ui_2_3_17_release(int i10) {
        this.f13109i = i10;
    }

    public final void setMediaPreview$giphy_ui_2_3_17_release(@Nullable C1741w c1741w) {
        this.f13107g1 = c1741w;
    }

    public final void setMediaSelectorHeight$giphy_ui_2_3_17_release(int i10) {
        this.f13103d = i10;
    }

    public final void setMediaSelectorView$giphy_ui_2_3_17_release(@Nullable C1743y c1743y) {
        this.f13123v = c1743y;
    }

    public final void setMetadata$giphy_ui_2_3_17_release(@NotNull HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.f13113m = hashMap;
    }

    public final void setPKeyboardState$giphy_ui_2_3_17_release(@NotNull U.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f13099a = dVar;
    }

    public final void setQuery$giphy_ui_2_3_17_release(@Nullable String str) {
        this.f13092L = str;
    }

    public final void setRecentSearches$giphy_ui_2_3_17_release(@NotNull O8.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f13097V = dVar;
    }

    public final void setSearchBackButton$giphy_ui_2_3_17_release(@Nullable ImageView imageView) {
        this.f13120s = imageView;
    }

    public final void setSearchBar$giphy_ui_2_3_17_release(@Nullable a0 a0Var) {
        this.f13119r = a0Var;
    }

    public final void setSearchBarContainer$giphy_ui_2_3_17_release(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.f13121t = constraintLayout;
    }

    public final void setSearchBarMargin$giphy_ui_2_3_17_release(int i10) {
        this.f13110j = i10;
    }

    public final void setSearchBarMarginBottom$giphy_ui_2_3_17_release(int i10) {
        this.f13108h = i10;
    }

    public final void setSearchBarMarginTop$giphy_ui_2_3_17_release(int i10) {
        this.f13106g = i10;
    }

    public final void setSuggestionsPlaceholderView$giphy_ui_2_3_17_release(@Nullable View view) {
        this.f13125x = view;
    }

    public final void setSuggestionsView$giphy_ui_2_3_17_release(@Nullable D d10) {
        this.f13124w = d10;
    }

    public final void setTextState$giphy_ui_2_3_17_release(@NotNull U.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f13090J = cVar;
    }

    public final void setUserProfileInfoDialog$giphy_ui_2_3_17_release(@Nullable f0 f0Var) {
        this.f13117p1 = f0Var;
    }

    public final void setVideoAttributionView$giphy_ui_2_3_17_release(@Nullable View view) {
        this.f13081A = view;
    }

    public final void setVideoAttributionViewBinding$giphy_ui_2_3_17_release(@Nullable P8.i iVar) {
        this.f13082B = iVar;
    }

    public final void setVideoAttributionVisible$giphy_ui_2_3_17_release(boolean z10) {
        this.f13094P = z10;
    }

    public final void setVideoPlayer$giphy_ui_2_3_17_release(@Nullable U8.b bVar) {
        this.f13083C = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setSaveEnabled(true);
        setId(O8.s.f8469R);
        this.f13099a = U.d.CLOSED;
        this.f13100b = 2;
        this.f13102c = U8.f.a(30);
        this.f13103d = U8.f.a(46);
        this.f13104e = U8.f.a(46);
        this.f13105f = U8.f.a(6);
        this.f13113m = new HashMap();
        this.f13084D = new androidx.constraintlayout.widget.d();
        this.f13085E = new androidx.constraintlayout.widget.d();
        this.f13086F = new androidx.constraintlayout.widget.d();
        this.f13087G = ValueAnimator.ofFloat(0.0f, 0.0f);
        this.f13088H = ValueAnimator.ofFloat(0.0f, 0.0f);
        GPHContentType gPHContentType = GPHContentType.gif;
        this.f13089I = gPHContentType;
        this.f13090J = U.c.Create;
        this.f13091K = gPHContentType;
    }
}
