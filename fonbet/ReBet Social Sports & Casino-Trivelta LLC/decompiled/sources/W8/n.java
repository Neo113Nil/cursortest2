package W8;

import V8.C1728i;
import V8.C1743y;
import V8.E;
import V8.U;
import V8.a0;
import V8.b0;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.RecyclerView;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.network.response.ListMediaResponse;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import com.giphy.sdk.ui.views.GifView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public abstract class n {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, j.class, "queryChangedFromSearchBar", "queryChangedFromSearchBar(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Ljava/lang/String;)V", 1);
        }

        public final void a(String str) {
            j.c((W8.a) this.receiver, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, j.class, "onSearchPressed", "onSearchPressed(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Ljava/lang/String;)V", 1);
        }

        public final void a(String str) {
            j.b((W8.a) this.receiver, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f13139d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ W8.a f13140e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Media f13141f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C1728i f13142g;

        public static final class a implements K8.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1728i f13143a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Media f13144b;

            public a(C1728i c1728i, Media media) {
                this.f13143a = c1728i;
                this.f13144b = media;
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
                this.f13143a.q(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.f13144b), (Iterable) emptyList));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, W8.a aVar, Media media, C1728i c1728i) {
            super(0);
            this.f13139d = z10;
            this.f13140e = aVar;
            this.f13141f = media;
            this.f13142g = c1728i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m33invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33invoke() {
            if (this.f13139d) {
                this.f13140e.setFetchEmojiVariationsJob$giphy_ui_2_3_17_release(J8.d.f5962a.d().k(this.f13141f.getId(), new a(this.f13142g, this.f13141f)));
            }
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W8.a f13145d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(W8.a aVar) {
            super(0);
            this.f13145d = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m34invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m34invoke() {
            Future<?> fetchEmojiVariationsJob$giphy_ui_2_3_17_release = this.f13145d.getFetchEmojiVariationsJob$giphy_ui_2_3_17_release();
            if (fetchEmojiVariationsJob$giphy_ui_2_3_17_release != null) {
                fetchEmojiVariationsJob$giphy_ui_2_3_17_release.cancel(true);
            }
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W8.a f13146d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(W8.a aVar) {
            super(1);
            this.f13146d = aVar;
        }

        public final void a(Media media) {
            if (media != null) {
                if (this.f13146d.getGiphySettings$giphy_ui_2_3_17_release().getShowConfirmationScreen()) {
                    W8.g.l(this.f13146d, media);
                } else {
                    this.f13146d.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().h(media, ActionType.CLICK);
                    this.f13146d.a(media);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ W8.a f13147d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f13148e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(W8.a aVar, int i10) {
            super(1);
            this.f13147d = aVar;
            this.f13148e = i10;
        }

        public final void a(Media media) {
            if (media != null) {
                W8.h.a(this.f13147d, media, this.f13148e);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Media) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {
        public g(Object obj) {
            super(1, obj, r.class, "changeMediaType", "changeMediaType(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/GPHContentType;)V", 1);
        }

        public final void a(GPHContentType p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            r.b((W8.a) this.receiver, p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GPHContentType) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function2 {
        public h(Object obj) {
            super(2, obj, r.class, "changeLayoutType", "changeLayoutType(Lcom/giphy/sdk/ui/views/dialogview/GiphyDialogView;Lcom/giphy/sdk/ui/views/GPHMediaTypeView$LayoutType;Lcom/giphy/sdk/ui/views/GPHMediaTypeView$LayoutType;)V", 1);
        }

        public final void a(C1743y.a p02, C1743y.a p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            r.a((W8.a) this.receiver, p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1743y.a) obj, (C1743y.a) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final void d(W8.a aVar, Bundle arguments) {
        Object obj;
        Object obj2;
        GPHContentType gPHContentType;
        Parcelable parcelable;
        Object parcelable2;
        Object parcelable3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            parcelable3 = arguments.getParcelable("gph_giphy_settings", GPHSettings.class);
            obj = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable4 = arguments.getParcelable("gph_giphy_settings");
            if (!(parcelable4 instanceof GPHSettings)) {
                parcelable4 = null;
            }
            obj = (GPHSettings) parcelable4;
        }
        Intrinsics.checkNotNull(obj);
        aVar.setGiphySettings$giphy_ui_2_3_17_release((GPHSettings) obj);
        aVar.setGiphyApiKey$giphy_ui_2_3_17_release(arguments.getString("gph_giphy_api_key"));
        if (i10 >= 33) {
            obj2 = arguments.getSerializable("gph_giphy_metadata_key", HashMap.class);
        } else {
            Object serializable = arguments.getSerializable("gph_giphy_metadata_key");
            if (!(serializable instanceof HashMap)) {
                serializable = null;
            }
            obj2 = (HashMap) serializable;
        }
        HashMap<String, String> hashMap = (HashMap) obj2;
        if (hashMap != null) {
            aVar.setMetadata$giphy_ui_2_3_17_release(hashMap);
        }
        String giphyApiKey$giphy_ui_2_3_17_release = aVar.getGiphyApiKey$giphy_ui_2_3_17_release();
        int i11 = 0;
        if (giphyApiKey$giphy_ui_2_3_17_release != null) {
            aVar.setGiphyVerificationMode$giphy_ui_2_3_17_release(Boolean.valueOf(arguments.getBoolean("gph_giphy_verification_mode")));
            O8.k kVar = O8.k.f8390a;
            Context context = aVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Boolean giphyVerificationMode$giphy_ui_2_3_17_release = aVar.getGiphyVerificationMode$giphy_ui_2_3_17_release();
            O8.k.c(kVar, context, giphyApiKey$giphy_ui_2_3_17_release, giphyVerificationMode$giphy_ui_2_3_17_release != null ? giphyVerificationMode$giphy_ui_2_3_17_release.booleanValue() : false, aVar.getMetadata$giphy_ui_2_3_17_release(), null, 16, null);
        }
        Context context2 = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        aVar.setRecentSearches$giphy_ui_2_3_17_release(new O8.d(context2));
        aVar.setGphSuggestions$giphy_ui_2_3_17_release(new O8.i(aVar.getRecentSearches$giphy_ui_2_3_17_release()));
        if (aVar.getGiphySettings$giphy_ui_2_3_17_release().getStickerColumnCount() < 2 || aVar.getGiphySettings$giphy_ui_2_3_17_release().getStickerColumnCount() > 4) {
            aVar.getGiphySettings$giphy_ui_2_3_17_release().q0(2);
        }
        O8.k.f8390a.o(aVar.getGiphySettings$giphy_ui_2_3_17_release().getTheme().b(aVar.getContext()));
        GPHContentType gPHContentType2 = (aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig().length <= 1 || ArraysKt.first(aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig()) != GPHContentType.recents) ? (GPHContentType) ArraysKt.first(aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig()) : aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig()[1];
        GPHContentType[] mediaTypeConfig = aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig();
        int length = mediaTypeConfig.length;
        while (true) {
            if (i11 >= length) {
                gPHContentType = null;
                break;
            }
            gPHContentType = mediaTypeConfig[i11];
            if (gPHContentType == aVar.getGiphySettings$giphy_ui_2_3_17_release().getSelectedContentType()) {
                break;
            } else {
                i11++;
            }
        }
        if (gPHContentType != null) {
            gPHContentType2 = gPHContentType;
        }
        aVar.setContentType$giphy_ui_2_3_17_release(gPHContentType2);
        if (aVar.getContentType$giphy_ui_2_3_17_release() == GPHContentType.recents && O8.k.f8390a.g().c().isEmpty()) {
            aVar.setContentType$giphy_ui_2_3_17_release(GPHContentType.gif);
        }
        if (arguments.containsKey("key_media_type")) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("key_media_type", GPHContentType.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable5 = arguments.getParcelable("key_media_type");
                parcelable = (GPHContentType) (parcelable5 instanceof GPHContentType ? parcelable5 : null);
            }
            GPHContentType gPHContentType3 = (GPHContentType) parcelable;
            if (gPHContentType3 == null) {
                gPHContentType3 = GPHContentType.gif;
            }
            aVar.setContentType$giphy_ui_2_3_17_release(gPHContentType3);
        }
        aVar.setSearchBarMarginTop$giphy_ui_2_3_17_release(aVar.getResources().getDimensionPixelSize(O8.q.f8407f));
        aVar.setSearchBarMarginBottom$giphy_ui_2_3_17_release(aVar.getResources().getDimensionPixelSize(O8.q.f8406e));
        aVar.setSearchBarMargin$giphy_ui_2_3_17_release(aVar.getResources().getDimensionPixelSize(O8.q.f8405d));
        aVar.setMarginBottom$giphy_ui_2_3_17_release(aVar.getResources().getDimensionPixelSize(O8.q.f8402a));
    }

    public static final void e(W8.a aVar, Bundle bundle) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Context context = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        aVar.setContainerView$giphy_ui_2_3_17_release(new E(context, null, 0, 6, null));
        Context context2 = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        b0 b0Var = new b0(context2, null, 0, 6, null);
        b0Var.setId(O8.s.f8516t);
        aVar.setBaseView$giphy_ui_2_3_17_release(b0Var);
        Context context3 = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        b0 b0Var2 = new b0(context3, null, 0, 6, null);
        b0Var2.setId(O8.s.f8518u);
        O8.k kVar = O8.k.f8390a;
        b0Var2.setBackgroundColor(kVar.h().g());
        aVar.setBaseViewOverlay$giphy_ui_2_3_17_release(b0Var2);
        ConstraintLayout constraintLayout = new ConstraintLayout(aVar.getContext());
        constraintLayout.setId(O8.s.f8439A);
        aVar.setSearchBarContainer$giphy_ui_2_3_17_release(constraintLayout);
        aVar.getSearchBarContainer$giphy_ui_2_3_17_release().setBackgroundColor(-65536);
        Context context4 = aVar.getBaseView$giphy_ui_2_3_17_release().getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "baseView.context");
        T8.k kVar2 = new T8.k(context4, null, 0, 6, null);
        kVar2.setId(O8.s.f8526y);
        kVar2.getGifsAdapter().k().n(aVar.getGiphySettings$giphy_ui_2_3_17_release());
        kVar2.getGifsAdapter().k().r(aVar.getGiphySettings$giphy_ui_2_3_17_release().getShowCheckeredBackground());
        kVar2.getGifsAdapter().k().o(aVar.getGiphySettings$giphy_ui_2_3_17_release().getImageFormat());
        aVar.setGifsRecyclerView$giphy_ui_2_3_17_release(kVar2);
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().setBackgroundColor(kVar.h().a());
        aVar.getSearchBarContainer$giphy_ui_2_3_17_release().setBackgroundColor(kVar.h().a());
        l(aVar);
        aVar.getContainerView$giphy_ui_2_3_17_release().addView(aVar.getBaseView$giphy_ui_2_3_17_release());
        aVar.getContainerView$giphy_ui_2_3_17_release().addView(aVar.getBaseViewOverlay$giphy_ui_2_3_17_release());
        aVar.getContainerView$giphy_ui_2_3_17_release().setDragView(aVar.getSearchBarContainer$giphy_ui_2_3_17_release());
        aVar.getContainerView$giphy_ui_2_3_17_release().setSlideView(aVar.getBaseView$giphy_ui_2_3_17_release());
        aVar.getContainerConstraints$giphy_ui_2_3_17_release().k(aVar.getSearchBarContainer$giphy_ui_2_3_17_release().getId(), 1);
        aVar.getBaseView$giphy_ui_2_3_17_release().addView(aVar.getSearchBarContainer$giphy_ui_2_3_17_release(), -1, 0);
        aVar.getBaseView$giphy_ui_2_3_17_release().addView(aVar.getGifsRecyclerView$giphy_ui_2_3_17_release(), -1, 0);
        aVar.getBaseView$giphy_ui_2_3_17_release().setBackgroundColor(-16711936);
        aVar.addView(aVar.getContainerView$giphy_ui_2_3_17_release(), -1, -1);
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().c(aVar.getSearchBarContainer$giphy_ui_2_3_17_release());
        aVar.getContainerConstraints$giphy_ui_2_3_17_release().c(aVar.getBaseView$giphy_ui_2_3_17_release());
        aVar.getResultsConstraints$giphy_ui_2_3_17_release().c(aVar.getBaseView$giphy_ui_2_3_17_release());
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release == null) {
            return;
        }
        searchBar$giphy_ui_2_3_17_release.setHideKeyboardOnSearch(true);
    }

    public static final void f(final W8.a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.setQueryListener(new a(aVar));
        }
        a0 searchBar$giphy_ui_2_3_17_release2 = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release2 != null) {
            searchBar$giphy_ui_2_3_17_release2.setOnSearchClickAction(new b(aVar));
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: W8.m
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                n.g(a.this, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        aVar.getBaseView$giphy_ui_2_3_17_release().setBackgroundColor(0);
        aVar.getBaseViewOverlay$giphy_ui_2_3_17_release().setVisibility(4);
        AbstractC2082d0.s0(aVar.getBaseView$giphy_ui_2_3_17_release(), aVar.getFragmentElevation$giphy_ui_2_3_17_release());
        AbstractC2082d0.s0(aVar.getBaseViewOverlay$giphy_ui_2_3_17_release(), aVar.getFragmentElevation$giphy_ui_2_3_17_release());
        o.f(aVar);
    }

    public static final void g(W8.a this_onViewCreated, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.checkNotNullParameter(this_onViewCreated, "$this_onViewCreated");
        if (i17 != i13) {
            U.d dVar = i17 > i13 ? U.d.OPEN : U.d.CLOSED;
            if (dVar != this_onViewCreated.getPKeyboardState$giphy_ui_2_3_17_release()) {
                r.d(this_onViewCreated, dVar);
            }
        }
    }

    public static final void h(W8.a aVar, C1728i emojiDrawer, Media defaultEmojiVariation, List emojiVariations, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(emojiDrawer, "emojiDrawer");
        Intrinsics.checkNotNullParameter(defaultEmojiVariation, "defaultEmojiVariation");
        Intrinsics.checkNotNullParameter(emojiVariations, "emojiVariations");
        Future<?> fetchEmojiVariationsJob$giphy_ui_2_3_17_release = aVar.getFetchEmojiVariationsJob$giphy_ui_2_3_17_release();
        if (fetchEmojiVariationsJob$giphy_ui_2_3_17_release != null) {
            fetchEmojiVariationsJob$giphy_ui_2_3_17_release.cancel(true);
        }
        Context context = aVar.getContext();
        if (context == null) {
            return;
        }
        RecyclerView.F e02 = aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().e0(i10);
        View view = e02 != null ? e02.itemView : null;
        GifView gifView = view instanceof GifView ? (GifView) view : null;
        if (gifView == null) {
            return;
        }
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().performHapticFeedback(3);
        int width = (int) (gifView.getWidth() * gifView.getScaleX());
        int height = (int) (gifView.getHeight() * gifView.getScaleY());
        O8.k kVar = O8.k.f8390a;
        emojiDrawer.o(context, gifView, width, height, kVar.h().j(), kVar.h().i(), kVar.h().h(), CollectionsKt.plus((Collection) CollectionsKt.listOf(defaultEmojiVariation), (Iterable) emojiVariations), new c(z10, aVar, defaultEmojiVariation, emojiDrawer), new d(aVar), new e(aVar), new f(aVar, i10));
    }

    public static final void i(W8.a aVar, GPHSettings settings, String str, Boolean bool, Function3 function3, HashMap metadata) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        O8.k.f8390a.p(function3);
        Bundle bundle = new Bundle();
        bundle.putParcelable("gph_giphy_settings", settings);
        if (str != null) {
            bundle.putString("gph_giphy_api_key", str);
        }
        if (bool != null) {
            bundle.putBoolean("gph_giphy_verification_mode", bool.booleanValue());
        }
        bundle.putSerializable("gph_giphy_metadata_key", metadata);
        d(aVar, bundle);
        e(aVar, bundle);
    }

    public static /* synthetic */ void j(W8.a aVar, C1728i c1728i, Media media, List list, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        h(aVar, c1728i, media, list, i10, z10);
    }

    public static final void k(W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Context context = aVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        O8.k kVar = O8.k.f8390a;
        aVar.setMediaSelectorView$giphy_ui_2_3_17_release(new C1743y(context, kVar.h(), aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig()));
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        if (mediaSelectorView$giphy_ui_2_3_17_release != null) {
            mediaSelectorView$giphy_ui_2_3_17_release.setBackgroundColor(kVar.h().a());
            mediaSelectorView$giphy_ui_2_3_17_release.setId(O8.s.f8522w);
            mediaSelectorView$giphy_ui_2_3_17_release.setMediaConfigListener(new g(aVar));
            mediaSelectorView$giphy_ui_2_3_17_release.setLayoutTypeListener(new h(aVar));
            mediaSelectorView$giphy_ui_2_3_17_release.setGphContentType(aVar.getContentType$giphy_ui_2_3_17_release());
            aVar.getBaseView$giphy_ui_2_3_17_release().addView(mediaSelectorView$giphy_ui_2_3_17_release);
            mediaSelectorView$giphy_ui_2_3_17_release.setBackgroundColor(kVar.h().a());
            aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(mediaSelectorView$giphy_ui_2_3_17_release.getId(), 4, 0, 4);
            aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(mediaSelectorView$giphy_ui_2_3_17_release.getId(), 6, 0, 6);
            aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(mediaSelectorView$giphy_ui_2_3_17_release.getId(), 7, 0, 7);
            aVar.setMediaSelectorHeight$giphy_ui_2_3_17_release(aVar.getGiphySettings$giphy_ui_2_3_17_release().getMediaTypeConfig().length >= 2 ? U8.f.a(46) : 0);
            aVar.getContainerConstraints$giphy_ui_2_3_17_release().l(mediaSelectorView$giphy_ui_2_3_17_release.getId(), aVar.getMediaSelectorHeight$giphy_ui_2_3_17_release());
        }
    }

    public static final void l(final W8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        timber.log.a.a("setupWaterfallView", new Object[0]);
        Context context = aVar.getBaseView$giphy_ui_2_3_17_release().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "baseView.context");
        O8.k kVar = O8.k.f8390a;
        a0 a0Var = new a0(context, kVar.h());
        a0Var.setId(O8.s.f8528z);
        aVar.setSearchBar$giphy_ui_2_3_17_release(a0Var);
        aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(aVar.getSearchBarContainer$giphy_ui_2_3_17_release().getId(), 3, 0, 3);
        aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(aVar.getSearchBarContainer$giphy_ui_2_3_17_release().getId(), 6, 0, 6);
        aVar.getContainerConstraints$giphy_ui_2_3_17_release().h(aVar.getSearchBarContainer$giphy_ui_2_3_17_release().getId(), 7, 0, 7);
        k(aVar);
        aVar.getResultsConstraints$giphy_ui_2_3_17_release().h(aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getId(), 3, aVar.getSearchBarContainer$giphy_ui_2_3_17_release().getId(), 4);
        androidx.constraintlayout.widget.d resultsConstraints$giphy_ui_2_3_17_release = aVar.getResultsConstraints$giphy_ui_2_3_17_release();
        int id2 = aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getId();
        C1743y mediaSelectorView$giphy_ui_2_3_17_release = aVar.getMediaSelectorView$giphy_ui_2_3_17_release();
        Intrinsics.checkNotNull(mediaSelectorView$giphy_ui_2_3_17_release);
        resultsConstraints$giphy_ui_2_3_17_release.h(id2, 4, mediaSelectorView$giphy_ui_2_3_17_release.getId(), 3);
        aVar.getResultsConstraints$giphy_ui_2_3_17_release().h(aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getId(), 6, 0, 6);
        aVar.getResultsConstraints$giphy_ui_2_3_17_release().h(aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getId(), 7, 0, 7);
        ImageView imageView = new ImageView(aVar.getContext());
        imageView.setImageResource(O8.r.f8413a);
        imageView.setId(O8.s.f8520v);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(kVar.h().k());
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(imageView.getId(), 3, 0, 3);
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(imageView.getId(), 6, 0, 6);
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(imageView.getId(), 7, 0, 7);
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(imageView.getId(), 3, aVar.getSearchBarMarginTop$giphy_ui_2_3_17_release());
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().l(imageView.getId(), 20);
        aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().m(imageView.getId(), 250);
        aVar.setSearchBackButton$giphy_ui_2_3_17_release(new ImageView(aVar.getContext()));
        final ImageView searchBackButton$giphy_ui_2_3_17_release = aVar.getSearchBackButton$giphy_ui_2_3_17_release();
        if (searchBackButton$giphy_ui_2_3_17_release != null) {
            a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
            if (searchBar$giphy_ui_2_3_17_release != null) {
                searchBar$giphy_ui_2_3_17_release.post(new Runnable() { // from class: W8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.m(searchBackButton$giphy_ui_2_3_17_release, aVar);
                    }
                });
            }
            Context context2 = aVar.getContext();
            searchBackButton$giphy_ui_2_3_17_release.setContentDescription(context2 != null ? context2.getString(O8.u.f8547a) : null);
            searchBackButton$giphy_ui_2_3_17_release.setImageResource(O8.r.f8415c);
            searchBackButton$giphy_ui_2_3_17_release.setId(O8.s.f8477Z);
            searchBackButton$giphy_ui_2_3_17_release.setScaleType(scaleType);
            searchBackButton$giphy_ui_2_3_17_release.setColorFilter(kVar.h().n());
            searchBackButton$giphy_ui_2_3_17_release.setOnClickListener(new View.OnClickListener() { // from class: W8.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    n.n(a.this, view);
                }
            });
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().l(searchBackButton$giphy_ui_2_3_17_release.getId(), -2);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().m(searchBackButton$giphy_ui_2_3_17_release.getId(), -2);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBackButton$giphy_ui_2_3_17_release.getId(), 6, 0, 6);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBackButton$giphy_ui_2_3_17_release.getId(), 6, aVar.getSearchBarMargin$giphy_ui_2_3_17_release() * 2);
            aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBackButton$giphy_ui_2_3_17_release.getId(), 7, aVar.getSearchBarMargin$giphy_ui_2_3_17_release());
            a0 searchBar$giphy_ui_2_3_17_release2 = aVar.getSearchBar$giphy_ui_2_3_17_release();
            if (searchBar$giphy_ui_2_3_17_release2 != null) {
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBackButton$giphy_ui_2_3_17_release.getId(), 3, searchBar$giphy_ui_2_3_17_release2.getId(), 3);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBackButton$giphy_ui_2_3_17_release.getId(), 4, searchBar$giphy_ui_2_3_17_release2.getId(), 4);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBackButton$giphy_ui_2_3_17_release.getId(), 7, searchBar$giphy_ui_2_3_17_release2.getId(), 6);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBar$giphy_ui_2_3_17_release2.getId(), 3, imageView.getId(), 4);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBar$giphy_ui_2_3_17_release2.getId(), 6, searchBackButton$giphy_ui_2_3_17_release.getId(), 7);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().h(searchBar$giphy_ui_2_3_17_release2.getId(), 7, 0, 7);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().l(searchBar$giphy_ui_2_3_17_release2.getId(), 1);
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBar$giphy_ui_2_3_17_release2.getId(), 3, aVar.getSearchBarMarginTop$giphy_ui_2_3_17_release());
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBar$giphy_ui_2_3_17_release2.getId(), 4, aVar.getSearchBarMarginBottom$giphy_ui_2_3_17_release());
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBar$giphy_ui_2_3_17_release2.getId(), 6, aVar.getSearchBarMargin$giphy_ui_2_3_17_release());
                aVar.getSearchBarConstrains$giphy_ui_2_3_17_release().y(searchBar$giphy_ui_2_3_17_release2.getId(), 7, aVar.getSearchBarMargin$giphy_ui_2_3_17_release());
            }
            aVar.getSearchBarContainer$giphy_ui_2_3_17_release().addView(imageView, -2, -2);
            aVar.getSearchBarContainer$giphy_ui_2_3_17_release().addView(searchBackButton$giphy_ui_2_3_17_release);
        }
        aVar.getSearchBarContainer$giphy_ui_2_3_17_release().addView(aVar.getSearchBar$giphy_ui_2_3_17_release());
        o.c(aVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        aVar.getBaseView$giphy_ui_2_3_17_release().setLayoutParams(layoutParams);
    }

    public static final void m(ImageView searchBackButton, W8.a this_setupWaterfallView) {
        EditText searchInput;
        Intrinsics.checkNotNullParameter(searchBackButton, "$searchBackButton");
        Intrinsics.checkNotNullParameter(this_setupWaterfallView, "$this_setupWaterfallView");
        a0 searchBar$giphy_ui_2_3_17_release = this_setupWaterfallView.getSearchBar$giphy_ui_2_3_17_release();
        Editable text = (searchBar$giphy_ui_2_3_17_release == null || (searchInput = searchBar$giphy_ui_2_3_17_release.getSearchInput()) == null) ? null : searchInput.getText();
        searchBackButton.setVisibility((text == null || text.length() == 0) ? 8 : 0);
    }

    public static final void n(W8.a this_setupWaterfallView, View view) {
        Intrinsics.checkNotNullParameter(this_setupWaterfallView, "$this_setupWaterfallView");
        if (this_setupWaterfallView.b()) {
            W8.g.k(this_setupWaterfallView);
            return;
        }
        if (this_setupWaterfallView.c()) {
            w.k(this_setupWaterfallView);
            return;
        }
        String query$giphy_ui_2_3_17_release = this_setupWaterfallView.getQuery$giphy_ui_2_3_17_release();
        if (query$giphy_ui_2_3_17_release == null || query$giphy_ui_2_3_17_release.length() == 0) {
            return;
        }
        a0 searchBar$giphy_ui_2_3_17_release = this_setupWaterfallView.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.I();
        }
        a0 searchBar$giphy_ui_2_3_17_release2 = this_setupWaterfallView.getSearchBar$giphy_ui_2_3_17_release();
        EditText searchInput = searchBar$giphy_ui_2_3_17_release2 != null ? searchBar$giphy_ui_2_3_17_release2.getSearchInput() : null;
        if (searchInput == null) {
            return;
        }
        searchInput.setText((CharSequence) null);
    }
}
