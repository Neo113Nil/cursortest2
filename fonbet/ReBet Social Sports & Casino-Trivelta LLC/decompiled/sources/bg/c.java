package bg;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.U;
import bg.c;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticleViewModel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.ui.activities.ArticlesActivity;
import com.zoho.livechat.android.ui.customviews.ArticleWebView;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import jf.EnumC5132a;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.InterfaceC5322g;
import l.AbstractC5335a;
import lb.C5444x;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import mf.C5583a;
import od.AbstractC5886l;
import od.t;
import rd.C6218a;
import w.d;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u009e\u0001\u009f\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J3\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b+\u0010 J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\u0003R$\u00108\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010-\"\u0004\bD\u0010\bR$\u0010K\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010O\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u0016\u0010Q\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010FR\"\u0010U\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010F\u001a\u0004\bS\u0010H\"\u0004\bT\u0010JR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R$\u0010i\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010x\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010z\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010B\u001a\u0004\bz\u0010-\"\u0004\b{\u0010\bR\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R\u0018\u0010\u0083\u0001\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010XR\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R!\u0010\u008f\u0001\u001a\u00030\u008a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006 \u0001"}, d2 = {"Lbg/c;", "Lbg/f;", "<init>", "()V", "", "show", "", "t0", "(Z)V", "P0", "w0", "u0", "F0", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "article", "K0", "(Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;)V", "H0", "Landroid/widget/ImageView;", "normalView", "selectionView", "dislike", "", "count", "v0", "(Landroid/widget/ImageView;Landroid/widget/ImageView;ZI)V", "view_type", "G0", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onActivityCreated", "onBackPressed", "()Z", "onResume", "onDestroy", "onDetach", "Lcom/zoho/livechat/android/ui/customviews/ArticleWebView;", X9.m.f13664a, "Lcom/zoho/livechat/android/ui/customviews/ArticleWebView;", "getWebView", "()Lcom/zoho/livechat/android/ui/customviews/ArticleWebView;", "setWebView", "(Lcom/zoho/livechat/android/ui/customviews/ArticleWebView;)V", "webView", "", "n", "Ljava/lang/String;", "y0", "()Ljava/lang/String;", "setArticleId", "(Ljava/lang/String;)V", "articleId", "o", "Z", "isOpenedFromSearchedArticles", "setOpenedFromSearchedArticles", "p", "Landroid/widget/ImageView;", "getLikeIcon", "()Landroid/widget/ImageView;", "setLikeIcon", "(Landroid/widget/ImageView;)V", "likeIcon", "q", "getDislikeIcon", "setDislikeIcon", "dislikeIcon", "r", "likeIconSelected", "s", "z0", "L0", "dislikeIconSelected", "Landroid/widget/TextView;", "t", "Landroid/widget/TextView;", "B0", "()Landroid/widget/TextView;", "N0", "(Landroid/widget/TextView;)V", "likeTextView", "u", "A0", "M0", "dislikeTextView", "Landroid/widget/RelativeLayout;", "v", "Landroid/widget/RelativeLayout;", "getBottomViewLayout", "()Landroid/widget/RelativeLayout;", "setBottomViewLayout", "(Landroid/widget/RelativeLayout;)V", "bottomViewLayout", "Landroid/widget/ProgressBar;", "w", "Landroid/widget/ProgressBar;", "D0", "()Landroid/widget/ProgressBar;", "O0", "(Landroid/widget/ProgressBar;)V", "progressBar", C5444x.f55808b, "Landroid/view/View;", "getBottomLayoutShadow", "()Landroid/view/View;", "setBottomLayoutShadow", "(Landroid/view/View;)V", "bottomLayoutShadow", "y", "isVoted", "setVoted", "Landroid/widget/LinearLayout;", "z", "Landroid/widget/LinearLayout;", "likeLayout", "A", "dislikeLayout", "B", "thanksFeedbackView", "Landroid/graphics/drawable/Drawable;", "C", "Landroid/graphics/drawable/Drawable;", "likeDrawable", "D", "disLikeDrawable", "Ljava/text/NumberFormat;", "E", "Lkotlin/Lazy;", "C0", "()Ljava/text/NumberFormat;", "numberFormat", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticleViewModel;", "F", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticleViewModel;", "articleViewModel", "LPh/C0;", "G", "LPh/C0;", "syncFlowJob", "x0", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "Lcom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity;", "E0", "()Lcom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity;", "salesIQActivity", "a", com.google.crypto.tink.integration.android.b.f37029b, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleFragment.kt\ncom/zoho/livechat/android/ui/fragments/ArticleFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,723:1\n1#2:724\n108#3:725\n80#3,22:726\n*S KotlinDebug\n*F\n+ 1 ArticleFragment.kt\ncom/zoho/livechat/android/ui/fragments/ArticleFragment\n*L\n343#1:725\n343#1:726,22\n*E\n"})
/* loaded from: classes4.dex */
public final class c extends bg.f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public LinearLayout dislikeLayout;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public TextView thanksFeedbackView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public Drawable likeDrawable;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public Drawable disLikeDrawable;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final Lazy numberFormat = LazyKt.lazy(i.f25069d);

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public ArticleViewModel articleViewModel;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public C0 syncFlowJob;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public ArticleWebView webView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public String articleId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isOpenedFromSearchedArticles;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public ImageView likeIcon;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public ImageView dislikeIcon;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public ImageView likeIconSelected;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public ImageView dislikeIconSelected;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public TextView likeTextView;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public TextView dislikeTextView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public RelativeLayout bottomViewLayout;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public ProgressBar progressBar;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public View bottomLayoutShadow;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public boolean isVoted;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public LinearLayout likeLayout;

    public class a extends WebChromeClient {

        /* renamed from: a, reason: collision with root package name */
        public View f25044a;

        /* renamed from: b, reason: collision with root package name */
        public WebChromeClient.CustomViewCallback f25045b;

        /* renamed from: c, reason: collision with root package name */
        public int f25046c;

        /* renamed from: d, reason: collision with root package name */
        public int f25047d;

        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            MobilistenInitProvider.Companion companion = MobilistenInitProvider.INSTANCE;
            Application e10 = companion.e();
            Intrinsics.checkNotNull(e10);
            if (e10.getApplicationContext() == null) {
                return null;
            }
            Application e11 = companion.e();
            Intrinsics.checkNotNull(e11);
            return BitmapFactory.decodeResource(e11.getApplicationContext().getResources(), 2130837573);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            Window window;
            Window window2;
            Activity n10 = Uf.j.n();
            View decorView = (n10 == null || (window2 = n10.getWindow()) == null) ? null : window2.getDecorView();
            FrameLayout frameLayout = decorView instanceof FrameLayout ? (FrameLayout) decorView : null;
            if (frameLayout != null) {
                frameLayout.removeView(this.f25044a);
            }
            this.f25044a = null;
            View decorView2 = (n10 == null || (window = n10.getWindow()) == null) ? null : window.getDecorView();
            if (decorView2 != null) {
                decorView2.setSystemUiVisibility(this.f25047d);
            }
            if (n10 != null) {
                n10.setRequestedOrientation(this.f25046c);
            }
            WebChromeClient.CustomViewCallback customViewCallback = this.f25045b;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.f25045b = null;
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
            Window window;
            Window window2;
            Window window3;
            View decorView;
            Intrinsics.checkNotNullParameter(paramView, "paramView");
            Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
            if (this.f25044a != null) {
                onHideCustomView();
                return;
            }
            Activity n10 = Uf.j.n();
            this.f25044a = paramView;
            View view = null;
            this.f25047d = og.i.k((n10 == null || (window3 = n10.getWindow()) == null || (decorView = window3.getDecorView()) == null) ? null : Integer.valueOf(decorView.getSystemUiVisibility()));
            this.f25046c = og.i.k(n10 != null ? Integer.valueOf(n10.getRequestedOrientation()) : null);
            this.f25045b = paramCustomViewCallback;
            View decorView2 = (n10 == null || (window2 = n10.getWindow()) == null) ? null : window2.getDecorView();
            Intrinsics.checkNotNull(decorView2, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) decorView2).addView(this.f25044a, new FrameLayout.LayoutParams(-1, -1));
            if (n10 != null && (window = n10.getWindow()) != null) {
                view = window.getDecorView();
            }
            if (view == null) {
                return;
            }
            view.setSystemUiVisibility(3846);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25049a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f25050b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f25051c = 2;

        public final int a() {
            return f25050b;
        }

        public final int b() {
            return f25051c;
        }
    }

    /* renamed from: bg.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0434c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5132a.values().length];
            try {
                iArr[EnumC5132a.Liked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5132a.Disliked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f25052n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f25054n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ c f25055o;

            /* renamed from: bg.c$d$a$a, reason: collision with other inner class name */
            public static final class C0435a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ c f25056a;

                public C0435a(c cVar) {
                    this.f25056a = cVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(SalesIQResource.Data data, Continuation continuation) {
                    AbstractActivityC2168s activity;
                    SalesIQResource.Data x02 = this.f25056a.x0();
                    if (x02 != null && x02.getEnabled()) {
                        c cVar = this.f25056a;
                        cVar.K0(cVar.x0());
                        this.f25056a.F0();
                    } else if (this.f25056a.getActivity() instanceof SalesIQActivity) {
                        MobilistenUtil.z(t.f61091p2, 0, 2, null);
                        SalesIQActivity E02 = this.f25056a.E0();
                        if (E02 != null) {
                            E02.onBackPressed();
                        }
                    } else if ((this.f25056a.getActivity() instanceof ArticlesActivity) && (activity = this.f25056a.getActivity()) != null) {
                        activity.onBackPressed();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, Continuation continuation) {
                super(2, continuation);
                this.f25055o = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f25055o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f25054n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ArticleViewModel articleViewModel = this.f25055o.articleViewModel;
                    if (articleViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                        articleViewModel = null;
                    }
                    C p10 = articleViewModel.p();
                    C0435a c0435a = new C0435a(this.f25055o);
                    this.f25054n = 1;
                    if (p10.collect(c0435a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f25052n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = c.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(c.this, null);
                this.f25052n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f25057n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f25059a;

            /* renamed from: bg.c$e$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0436a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ArticleViewModel.a.values().length];
                    try {
                        iArr[ArticleViewModel.a.Synced.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ArticleViewModel.a.Failed.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ArticleViewModel.a.Deleted.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public a(c cVar) {
                this.f25059a = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ArticleViewModel.a aVar, Continuation continuation) {
                int i10 = C0436a.$EnumSwitchMapping$0[aVar.ordinal()];
                if (i10 == 1) {
                    C0 c02 = this.f25059a.syncFlowJob;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                } else if (i10 == 3) {
                    SalesIQActivity E02 = this.f25059a.E0();
                    if (E02 != null) {
                        E02.onBackPressed();
                    }
                    C0 c03 = this.f25059a.syncFlowJob;
                    if (c03 != null) {
                        C0.a.b(c03, null, 1, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f25057n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ArticleViewModel articleViewModel = c.this.articleViewModel;
                if (articleViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                    articleViewModel = null;
                }
                C m10 = articleViewModel.m();
                a aVar = new a(c.this);
                this.f25057n = 1;
                if (m10.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f25060a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f25061b;

        public f(ImageView imageView, ImageView imageView2) {
            this.f25060a = imageView;
            this.f25061b = imageView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            ImageView imageView = this.f25060a;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(8);
            O0.l lVar = new O0.l(this.f25061b, O0.h.f8262o, 0.0f);
            O0.m mVar = new O0.m();
            mVar.f(0.5f);
            mVar.h(1500.0f);
            mVar.g(0.0f);
            lVar.x(mVar);
            lVar.q();
        }
    }

    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f25062a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f25063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25064c;

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f25065a;

            public a(c cVar) {
                this.f25065a = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                LinearLayout linearLayout = this.f25065a.likeLayout;
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setVisibility(8);
            }
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f25066a;

            public b(c cVar) {
                this.f25066a = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                LinearLayout linearLayout = this.f25066a.dislikeLayout;
                Intrinsics.checkNotNull(linearLayout);
                linearLayout.setVisibility(8);
            }
        }

        /* renamed from: bg.c$g$c, reason: collision with other inner class name */
        public static final class C0437c extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f25067a;

            public C0437c(c cVar) {
                this.f25067a = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                TextView textView = this.f25067a.thanksFeedbackView;
                TextView textView2 = null;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thanksFeedbackView");
                    textView = null;
                }
                textView.setVisibility(0);
                TextView textView3 = this.f25067a.thanksFeedbackView;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thanksFeedbackView");
                } else {
                    textView2 = textView3;
                }
                textView2.setAlpha(0.0f);
            }
        }

        public g(boolean z10, c cVar, int i10) {
            this.f25062a = z10;
            this.f25063b = cVar;
            this.f25064c = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            if (this.f25062a) {
                this.f25063b.A0().setText(this.f25063b.C0().format(Integer.valueOf(this.f25064c)));
            } else {
                this.f25063b.B0().setText(this.f25063b.C0().format(Integer.valueOf(this.f25064c)));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f25063b.likeLayout, "alpha", 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new a(this.f25063b));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f25063b.dislikeLayout, "alpha", 0.0f);
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.addListener(new b(this.f25063b));
            TextView textView = this.f25063b.thanksFeedbackView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thanksFeedbackView");
                textView = null;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f);
            ofFloat3.setDuration(200L);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.addListener(new C0437c(this.f25063b));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).after(1000L);
            animatorSet.start();
        }
    }

    public static final class h implements L4.g {
        public h() {
        }

        public static final void c(c this$0, InsetDrawable id2) {
            AbstractC5479a supportActionBar;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(id2, "$id");
            AbstractActivityC2168s activity = this$0.getActivity();
            AbstractActivityC5481c abstractActivityC5481c = activity instanceof AbstractActivityC5481c ? (AbstractActivityC5481c) activity : null;
            if (abstractActivityC5481c == null || (supportActionBar = abstractActivityC5481c.getSupportActionBar()) == null) {
                return;
            }
            supportActionBar.z(id2);
        }

        @Override // L4.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            final InsetDrawable insetDrawable = new InsetDrawable(resource, 0, 0, C6218a.b(8.0f), 0);
            AbstractActivityC2168s requireActivity = c.this.requireActivity();
            final c cVar = c.this;
            requireActivity.runOnUiThread(new Runnable() { // from class: bg.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.c(c.this, insetDrawable);
                }
            });
            return false;
        }

        @Override // L4.g
        public boolean k(com.bumptech.glide.load.engine.q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            return false;
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f25069d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NumberFormat invoke() {
            return NumberFormat.getInstance(Locale.getDefault());
        }
    }

    public static final class j extends WebViewClient {
        public j() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            if (!Patterns.WEB_URL.matcher(url).matches()) {
                if (!StringsKt.startsWith$default(url, "mailto:", false, 2, (Object) null) && !StringsKt.startsWith$default(url, "tel:", false, 2, (Object) null)) {
                    return false;
                }
                LiveChatUtil.handleUri(view.getContext(), url);
                return true;
            }
            d.C0946d c0946d = new d.C0946d();
            c0946d.p(com.zoho.livechat.android.utils.P.a(c.this.getContext()));
            w.d a10 = c0946d.a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            if (c.this.getActivity() != null) {
                a10.a(c.this.requireActivity(), Uri.parse(url));
            }
            return true;
        }
    }

    public static final class k extends a {
        public k(c cVar) {
            super();
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f25071d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f25072e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Bundle bundle, c cVar) {
            super(0);
            this.f25071d = bundle;
            this.f25072e = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            if (og.i.g(this.f25071d)) {
                C5583a.w(ZohoSalesIQ.k.Articles, C5583a.EnumC0818a.Opened, this.f25072e.getArticleId(), null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SalesIQActivity E0() {
        AbstractActivityC2168s activity = getActivity();
        if (activity instanceof SalesIQActivity) {
            return (SalesIQActivity) activity;
        }
        return null;
    }

    public static final void I0(c this$0, View view) {
        SalesIQResource.Data.Stats stats;
        SalesIQResource.Data.Language language;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isVoted) {
            return;
        }
        this$0.isVoted = true;
        String str = this$0.articleId;
        Integer num = null;
        if (str != null) {
            ArticleViewModel articleViewModel = this$0.articleViewModel;
            if (articleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                articleViewModel = null;
            }
            SalesIQResource.Data x02 = this$0.x0();
            articleViewModel.z(str, (x02 == null || (language = x02.getLanguage()) == null) ? null : language.getCode(), EnumC5132a.Disliked);
        }
        ImageView imageView = this$0.dislikeIcon;
        ImageView z02 = this$0.z0();
        SalesIQResource.Data x03 = this$0.x0();
        if (x03 != null && (stats = x03.getStats()) != null) {
            num = Integer.valueOf(stats.getDisliked());
        }
        this$0.v0(imageView, z02, true, og.i.k(num) + 1);
    }

    public static final void J0(c this$0, View view) {
        SalesIQResource.Data.Stats stats;
        SalesIQResource.Data.Language language;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isVoted) {
            return;
        }
        this$0.isVoted = true;
        String str = this$0.articleId;
        Integer num = null;
        if (str != null) {
            ArticleViewModel articleViewModel = this$0.articleViewModel;
            if (articleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                articleViewModel = null;
            }
            SalesIQResource.Data x02 = this$0.x0();
            articleViewModel.z(str, (x02 == null || (language = x02.getLanguage()) == null) ? null : language.getCode(), EnumC5132a.Liked);
        }
        ImageView imageView = this$0.likeIcon;
        ImageView imageView2 = this$0.likeIconSelected;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView2 = null;
        }
        SalesIQResource.Data x03 = this$0.x0();
        if (x03 != null && (stats = x03.getStats()) != null) {
            num = Integer.valueOf(stats.getLiked());
        }
        this$0.v0(imageView, imageView2, false, og.i.k(num) + 1);
    }

    private final void u0() {
        C0 d10;
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new d(null), 3, null);
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new e(null), 3, null);
        this.syncFlowJob = d10;
    }

    public final TextView A0() {
        TextView textView = this.dislikeTextView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dislikeTextView");
        return null;
    }

    public final TextView B0() {
        TextView textView = this.likeTextView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("likeTextView");
        return null;
    }

    public final NumberFormat C0() {
        Object value = this.numberFormat.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (NumberFormat) value;
    }

    public final ProgressBar D0() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        return null;
    }

    public final void F0() {
        AbstractC5479a supportActionBar;
        Long modifiedTime;
        Long modifiedTime2;
        Toolbar toolbar;
        SalesIQResource.Data x02;
        Long modifiedTime3;
        ArticleViewModel articleViewModel = this.articleViewModel;
        if (articleViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
            articleViewModel = null;
        }
        if (!articleViewModel.q()) {
            AbstractActivityC5481c abstractActivityC5481c = (AbstractActivityC5481c) getActivity();
            if (abstractActivityC5481c == null || (supportActionBar = abstractActivityC5481c.getSupportActionBar()) == null) {
                return;
            }
            SalesIQResource.Data x03 = x0();
            String title = x03 != null ? x03.getTitle() : null;
            if (title == null) {
                title = "";
            }
            supportActionBar.D(title);
            if (og.i.e(x0())) {
                SalesIQResource.Data x04 = x0();
                if (x04 == null || (modifiedTime2 = x04.getModifiedTime()) == null || modifiedTime2.longValue() != 0) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String string = getString(t.f61004d);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    Context context = getContext();
                    long f10 = rd.b.f();
                    SalesIQResource.Data x05 = x0();
                    modifiedTime = x05 != null ? x05.getModifiedTime() : null;
                    Intrinsics.checkNotNull(modifiedTime);
                    String format = String.format(string, Arrays.copyOf(new Object[]{MobilistenUtil.DateTime.b(context, f10 - modifiedTime.longValue(), 0, false, null, 28, null)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    supportActionBar.B(format);
                    return;
                }
                return;
            }
            return;
        }
        SalesIQResource.Data x06 = x0();
        SalesIQResource.Data.User modifier = x06 != null ? x06.getModifier() : null;
        AbstractActivityC2168s activity = getActivity();
        if (activity instanceof ArticlesActivity) {
            AbstractActivityC2168s activity2 = getActivity();
            ArticlesActivity articlesActivity = activity2 instanceof ArticlesActivity ? (ArticlesActivity) activity2 : null;
            if (articlesActivity != null) {
                toolbar = articlesActivity.getToolbar();
            }
            toolbar = null;
        } else {
            if (activity instanceof SalesIQActivity) {
                AbstractActivityC2168s activity3 = getActivity();
                SalesIQActivity salesIQActivity = activity3 instanceof SalesIQActivity ? (SalesIQActivity) activity3 : null;
                if (salesIQActivity != null) {
                    toolbar = salesIQActivity.getToolbar();
                }
            }
            toolbar = null;
        }
        if (modifier == null || toolbar == null) {
            return;
        }
        if (modifier.getDisplayName() != null) {
            toolbar.setTitle(modifier.getDisplayName());
        }
        if (og.i.e(x0()) && ((x02 = x0()) == null || (modifiedTime3 = x02.getModifiedTime()) == null || modifiedTime3.longValue() != 0)) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = getString(t.f61004d);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Context context2 = getContext();
            long f11 = rd.b.f();
            SalesIQResource.Data x07 = x0();
            modifiedTime = x07 != null ? x07.getModifiedTime() : null;
            Intrinsics.checkNotNull(modifiedTime);
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{MobilistenUtil.DateTime.b(context2, f11 - modifiedTime.longValue(), 0, false, null, 28, null)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            og.n.c(toolbar, format2);
        }
        if (getContext() == null || modifier.getImageUrl() == null) {
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        wd.d.v(requireContext, sd.d.d() + modifier.getImageUrl(), new h(), true, Integer.valueOf((int) getResources().getDimension(od.o.f59938e)));
    }

    public final void G0(int view_type) {
        b bVar = b.f25049a;
        if (view_type == bVar.b()) {
            D0().setVisibility(0);
            RelativeLayout relativeLayout = this.bottomViewLayout;
            Intrinsics.checkNotNull(relativeLayout);
            relativeLayout.setVisibility(8);
            View view = this.bottomLayoutShadow;
            Intrinsics.checkNotNull(view);
            view.setVisibility(8);
            return;
        }
        if (view_type == bVar.a()) {
            D0().setVisibility(8);
            RelativeLayout relativeLayout2 = this.bottomViewLayout;
            Intrinsics.checkNotNull(relativeLayout2);
            relativeLayout2.setVisibility(0);
            View view2 = this.bottomLayoutShadow;
            Intrinsics.checkNotNull(view2);
            view2.setVisibility(0);
        }
    }

    public final void H0() {
        SalesIQResource.Data.Stats stats;
        SalesIQResource.Data.Stats stats2;
        SalesIQResource.Data.Stats stats3;
        SalesIQResource.Data.Stats stats4;
        SalesIQResource.Data.Stats stats5;
        SalesIQResource.Data.Stats stats6;
        TextView textView = this.thanksFeedbackView;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thanksFeedbackView");
            textView = null;
        }
        textView.setVisibility(8);
        if (og.i.e(x0())) {
            ArticleViewModel articleViewModel = this.articleViewModel;
            if (articleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                articleViewModel = null;
            }
            if (articleViewModel.i()) {
                SalesIQResource.Data x02 = x0();
                Intrinsics.checkNotNull(x02);
                EnumC5132a ratedType = x02.getRatedType();
                int i10 = ratedType == null ? -1 : C0434c.$EnumSwitchMapping$0[ratedType.ordinal()];
                if (i10 == 1) {
                    TextView B02 = B0();
                    NumberFormat C02 = C0();
                    SalesIQResource.Data x03 = x0();
                    B02.setText(C02.format((x03 == null || (stats2 = x03.getStats()) == null) ? null : Integer.valueOf(RangesKt.coerceAtLeast(stats2.getLiked(), 1))));
                    TextView A02 = A0();
                    NumberFormat C03 = C0();
                    SalesIQResource.Data x04 = x0();
                    A02.setText(C03.format((x04 == null || (stats = x04.getStats()) == null) ? null : Integer.valueOf(stats.getDisliked())));
                    ImageView imageView2 = this.likeIcon;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    ImageView imageView3 = this.likeIconSelected;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
                        imageView3 = null;
                    }
                    imageView3.setVisibility(0);
                    z0().setVisibility(8);
                    LinearLayout linearLayout = this.dislikeLayout;
                    if (linearLayout != null) {
                        linearLayout.setAlpha(0.38f);
                    }
                    LinearLayout linearLayout2 = this.likeLayout;
                    if (linearLayout2 != null) {
                        linearLayout2.setOnClickListener(null);
                    }
                    LinearLayout linearLayout3 = this.likeLayout;
                    if (linearLayout3 == null) {
                        return;
                    }
                    linearLayout3.setBackground(null);
                    return;
                }
                if (i10 == 2) {
                    TextView B03 = B0();
                    NumberFormat C04 = C0();
                    SalesIQResource.Data x05 = x0();
                    B03.setText(C04.format((x05 == null || (stats4 = x05.getStats()) == null) ? null : Integer.valueOf(stats4.getLiked())));
                    TextView A03 = A0();
                    NumberFormat C05 = C0();
                    SalesIQResource.Data x06 = x0();
                    A03.setText(C05.format((x06 == null || (stats3 = x06.getStats()) == null) ? null : Integer.valueOf(RangesKt.coerceAtLeast(stats3.getDisliked(), 1))));
                    ImageView imageView4 = this.dislikeIcon;
                    if (imageView4 != null) {
                        imageView4.setVisibility(8);
                    }
                    z0().setVisibility(0);
                    LinearLayout linearLayout4 = this.likeLayout;
                    if (linearLayout4 != null) {
                        linearLayout4.setAlpha(0.38f);
                    }
                    ImageView imageView5 = this.likeIconSelected;
                    if (imageView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
                        imageView5 = null;
                    }
                    imageView5.setVisibility(8);
                    LinearLayout linearLayout5 = this.dislikeLayout;
                    if (linearLayout5 != null) {
                        linearLayout5.setOnClickListener(null);
                    }
                    LinearLayout linearLayout6 = this.dislikeLayout;
                    if (linearLayout6 == null) {
                        return;
                    }
                    linearLayout6.setBackground(null);
                    return;
                }
                LinearLayout linearLayout7 = this.likeLayout;
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
                LinearLayout linearLayout8 = this.dislikeLayout;
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
                TextView B04 = B0();
                NumberFormat C06 = C0();
                SalesIQResource.Data x07 = x0();
                B04.setText(C06.format((x07 == null || (stats6 = x07.getStats()) == null) ? null : Integer.valueOf(stats6.getLiked())));
                TextView A04 = A0();
                NumberFormat C07 = C0();
                SalesIQResource.Data x08 = x0();
                A04.setText(C07.format((x08 == null || (stats5 = x08.getStats()) == null) ? null : Integer.valueOf(stats5.getDisliked())));
                ImageView imageView6 = this.likeIcon;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
                ImageView imageView7 = this.dislikeIcon;
                if (imageView7 != null) {
                    imageView7.setVisibility(0);
                }
                ImageView imageView8 = this.likeIconSelected;
                if (imageView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
                } else {
                    imageView = imageView8;
                }
                imageView.setVisibility(8);
                z0().setVisibility(8);
                LinearLayout linearLayout9 = this.likeLayout;
                if (linearLayout9 != null) {
                    linearLayout9.setOnClickListener(new View.OnClickListener() { // from class: bg.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            c.J0(c.this, view);
                        }
                    });
                }
                LinearLayout linearLayout10 = this.dislikeLayout;
                if (linearLayout10 != null) {
                    linearLayout10.setOnClickListener(new View.OnClickListener() { // from class: bg.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            c.I0(c.this, view);
                        }
                    });
                    return;
                }
                return;
            }
        }
        LinearLayout linearLayout11 = this.likeLayout;
        if (linearLayout11 != null) {
            linearLayout11.setVisibility(8);
        }
        LinearLayout linearLayout12 = this.dislikeLayout;
        if (linearLayout12 != null) {
            linearLayout12.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.bottomViewLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.bottomLayoutShadow;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142 A[Catch: Exception -> 0x00f1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:38:0x00ce, B:40:0x00d6, B:42:0x00dc, B:44:0x00e4, B:45:0x00f4, B:47:0x00fa, B:48:0x0108, B:49:0x0114, B:52:0x0121, B:55:0x012e, B:57:0x0132, B:60:0x013e, B:62:0x0142, B:64:0x013b, B:66:0x0126, B:67:0x0119), top: B:37:0x00ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(SalesIQResource.Data article) {
        ArticleViewModel articleViewModel;
        ArticleViewModel articleViewModel2;
        String str;
        ArticleWebView articleWebView;
        ArticleWebView articleWebView2;
        WebSettings settings;
        ArticleWebView articleWebView3;
        ArticleViewModel articleViewModel3 = null;
        if (article == null) {
            G0(b.f25049a.b());
            String str2 = this.articleId;
            if (str2 != null) {
                ArticleViewModel articleViewModel4 = this.articleViewModel;
                if (articleViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                    articleViewModel = null;
                } else {
                    articleViewModel = articleViewModel4;
                }
                ArticleViewModel.y(articleViewModel, str2, false, null, 6, null);
                return;
            }
            return;
        }
        if (getActivity() != null) {
            String content = article.getContent();
            if (content != null) {
                int length = content.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) content.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                if (content.subSequence(i10, length + 1).toString().length() > 0) {
                    G0(b.f25049a.a());
                    H0();
                    try {
                        if (C6218a.M() != null) {
                            SharedPreferences M10 = C6218a.M();
                            Intrinsics.checkNotNull(M10);
                            if (M10.contains("article_css")) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("<style>");
                                SharedPreferences M11 = C6218a.M();
                                String string = M11 != null ? M11.getString("article_css", "") : null;
                                if (string == null) {
                                    string = "";
                                }
                                sb2.append(string);
                                sb2.append("</style>");
                                str = sb2.toString();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append("<div class=\"zsiq-prev-header\" id=\"zsiq-prev-header\"><strong>");
                                String title = article.getTitle();
                                sb3.append(title != null ? title : "");
                                sb3.append("</strong></div><div class=\"zsiq-prev-content\"><div>");
                                sb3.append(content);
                                String str3 = sb3.toString() + "</div></div>";
                                if (O2.g.a("FORCE_DARK")) {
                                    if (!MobilistenUtil.k()) {
                                        ArticleWebView articleWebView4 = this.webView;
                                        Intrinsics.checkNotNull(articleWebView4);
                                        O2.d.c(articleWebView4.getSettings(), 0);
                                    } else if (O2.g.a("ALGORITHMIC_DARKENING")) {
                                        ArticleWebView articleWebView5 = this.webView;
                                        Intrinsics.checkNotNull(articleWebView5);
                                        O2.d.b(articleWebView5.getSettings(), true);
                                    } else if (Build.VERSION.SDK_INT < 33) {
                                        ArticleWebView articleWebView6 = this.webView;
                                        Intrinsics.checkNotNull(articleWebView6);
                                        O2.d.c(articleWebView6.getSettings(), 2);
                                    }
                                }
                                articleWebView = this.webView;
                                if (articleWebView == null) {
                                    articleWebView.setWebViewClient(new j());
                                }
                                articleWebView2 = this.webView;
                                if (articleWebView2 == null) {
                                    articleWebView2.setWebChromeClient(new k(this));
                                }
                                ArticleWebView articleWebView7 = this.webView;
                                settings = articleWebView7 == null ? articleWebView7.getSettings() : null;
                                if (settings == null) {
                                    settings.setJavaScriptEnabled(true);
                                }
                                articleWebView3 = this.webView;
                                if (articleWebView3 != null) {
                                    articleWebView3.loadDataWithBaseURL(null, str3, "text/html; charset=UTF-8;", null, null);
                                }
                            }
                        }
                        if (O2.g.a("FORCE_DARK")) {
                        }
                        articleWebView = this.webView;
                        if (articleWebView == null) {
                        }
                        articleWebView2 = this.webView;
                        if (articleWebView2 == null) {
                        }
                        ArticleWebView articleWebView72 = this.webView;
                        if (articleWebView72 == null) {
                        }
                        if (settings == null) {
                        }
                        articleWebView3 = this.webView;
                        if (articleWebView3 != null) {
                        }
                    } catch (Exception e10) {
                        LiveChatUtil.log(e10);
                    }
                    str = "<style>   body {       margin: 0 !important;       padding: 0 !important;   }   .zsiq-prev-content {       margin: 0 20px;   }   .zsiq-prev-content img {       border-radius: 12px !important;   }   .zsiq-prev-content * {       word-break: break-word;       background-repeat: no-repeat !important;       max-width: 100%;   }   p {       padding-right: 10px;   }   h1 {     line-height: 1.3 !important;   }   .zsiq-prev-content iframe {       width: 100% !important;       max-width: 100% !important;   }   [class*=\"lst-\"] > li:not(:last-child) {       border-bottom-width: 0 !important;   }   .zsiq-prev-header {       text-align: left;       font-size: 18px;       line-height: 20px;       color: #212121;       padding: 20px;       word-break: break-word;   }</style>";
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append(str);
                    sb32.append("<div class=\"zsiq-prev-header\" id=\"zsiq-prev-header\"><strong>");
                    String title2 = article.getTitle();
                    sb32.append(title2 != null ? title2 : "");
                    sb32.append("</strong></div><div class=\"zsiq-prev-content\"><div>");
                    sb32.append(content);
                    String str32 = sb32.toString() + "</div></div>";
                }
            }
            G0(b.f25049a.b());
            String str4 = this.articleId;
            if (str4 != null) {
                ArticleViewModel articleViewModel5 = this.articleViewModel;
                if (articleViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                    articleViewModel2 = null;
                } else {
                    articleViewModel2 = articleViewModel5;
                }
                ArticleViewModel.y(articleViewModel2, str4, false, null, 6, null);
            }
        }
        ArticleViewModel articleViewModel6 = this.articleViewModel;
        if (articleViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
        } else {
            articleViewModel3 = articleViewModel6;
        }
        t0(articleViewModel3.i());
    }

    public final void L0(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.dislikeIconSelected = imageView;
    }

    public final void M0(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.dislikeTextView = textView;
    }

    public final void N0(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.likeTextView = textView;
    }

    public final void O0(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.progressBar = progressBar;
    }

    public final void P0() {
        String str = this.articleId;
        if (str != null) {
            ArticleViewModel articleViewModel = this.articleViewModel;
            if (articleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                articleViewModel = null;
            }
            articleViewModel.A(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int[] iArr = {AbstractC5335a.f54979L};
        if (getActivity() != null) {
            TypedArray obtainStyledAttributes = requireActivity().obtainStyledAttributes(iArr);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            LinearLayout linearLayout = this.likeLayout;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(resourceId);
            }
            LinearLayout linearLayout2 = this.dislikeLayout;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundResource(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        P0();
        w0();
        u0();
    }

    @Override // bg.f
    public boolean onBackPressed() {
        return false;
    }

    @Override // bg.f, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.articleViewModel = (ArticleViewModel) new U(this).a(ArticleViewModel.class);
        Bundle arguments = getArguments();
        ArticleViewModel articleViewModel = null;
        this.articleId = arguments != null ? arguments.getString("article_id") : null;
        Bundle arguments2 = getArguments();
        this.isOpenedFromSearchedArticles = og.i.i(arguments2 != null ? Boolean.valueOf(arguments2.getBoolean("is_opened_from_searched_articles", false)) : null);
        String str = this.articleId;
        if (str != null) {
            ArticleViewModel articleViewModel2 = this.articleViewModel;
            if (articleViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
            } else {
                articleViewModel = articleViewModel2;
            }
            articleViewModel.x(str, true, new l(savedInstanceState, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(od.r.f60822z, container, false);
        if (MobilistenUtil.m()) {
            inflate.setRotationY(180.0f);
        } else {
            inflate.setRotationY(0.0f);
        }
        ArticleWebView articleWebView = (ArticleWebView) inflate.findViewById(od.q.f60587m0);
        this.webView = articleWebView;
        if (articleWebView != null) {
            articleWebView.setBackgroundColor(com.zoho.livechat.android.utils.P.e(getContext(), AbstractC5886l.f59827g));
        }
        this.likeIcon = (ImageView) inflate.findViewById(od.q.f60285I5);
        this.dislikeIcon = (ImageView) inflate.findViewById(od.q.f60701x4);
        View findViewById = inflate.findViewById(od.q.f60295J5);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.likeIconSelected = (ImageView) findViewById;
        SalesIQActivity E02 = E0();
        if (E02 != null) {
            E02.g0();
        }
        ImageView imageView = this.likeIconSelected;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView = null;
        }
        Context context = imageView.getContext();
        int i10 = od.p.f60183w3;
        ImageView imageView2 = this.likeIconSelected;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView2 = null;
        }
        this.likeDrawable = LiveChatUtil.changeDrawableColor(context, i10, com.zoho.livechat.android.utils.P.e(imageView2.getContext(), AbstractC5886l.f59812d));
        ImageView imageView3 = this.likeIconSelected;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView3 = null;
        }
        Context context2 = imageView3.getContext();
        int i11 = od.p.f60163s3;
        ImageView imageView4 = this.likeIconSelected;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView4 = null;
        }
        this.disLikeDrawable = LiveChatUtil.changeDrawableColor(context2, i11, com.zoho.livechat.android.utils.P.e(imageView4.getContext(), AbstractC5886l.f59807c));
        ImageView imageView5 = this.likeIconSelected;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeIconSelected");
            imageView5 = null;
        }
        imageView5.setImageDrawable(this.likeDrawable);
        View findViewById2 = inflate.findViewById(od.q.f60711y4);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        L0((ImageView) findViewById2);
        z0().setImageDrawable(this.disLikeDrawable);
        View findViewById3 = inflate.findViewById(od.q.f60315L5);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        N0((TextView) findViewById3);
        B0().setTypeface(C6218a.C());
        View findViewById4 = inflate.findViewById(od.q.f60204A4);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        M0((TextView) findViewById4);
        A0().setTypeface(C6218a.C());
        this.likeLayout = (LinearLayout) inflate.findViewById(od.q.f60305K5);
        this.dislikeLayout = (LinearLayout) inflate.findViewById(od.q.f60721z4);
        View findViewById5 = inflate.findViewById(od.q.f60595m8);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        TextView textView2 = (TextView) findViewById5;
        this.thanksFeedbackView = textView2;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thanksFeedbackView");
        } else {
            textView = textView2;
        }
        textView.setTypeface(C6218a.P());
        this.bottomViewLayout = (RelativeLayout) inflate.findViewById(od.q.f60493d0);
        View findViewById6 = inflate.findViewById(od.q.f60637r0);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        O0((ProgressBar) findViewById6);
        D0().getIndeterminateDrawable().setColorFilter(new PorterDuffColorFilter(com.zoho.livechat.android.utils.P.a(getContext()), PorterDuff.Mode.SRC_ATOP));
        this.bottomLayoutShadow = inflate.findViewById(od.q.f60504e0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC5479a supportActionBar;
        super.onDestroy();
        if (!isStateSaved() || (getActivity() instanceof ArticlesActivity)) {
            C5583a.w(ZohoSalesIQ.k.Articles, C5583a.EnumC0818a.Closed, this.articleId, null, 8, null);
        }
        AbstractActivityC5481c abstractActivityC5481c = (AbstractActivityC5481c) getActivity();
        if (abstractActivityC5481c != null && (supportActionBar = abstractActivityC5481c.getSupportActionBar()) != null) {
            supportActionBar.B(null);
            supportActionBar.z(null);
        }
        SalesIQActivity E02 = E0();
        if (E02 != null) {
            if (!this.isOpenedFromSearchedArticles) {
                E02.A0(0);
            }
            E02.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        SalesIQActivity E02 = E0();
        if (E02 != null) {
            E02.g0();
        }
    }

    @Override // bg.f, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SalesIQActivity E02 = E0();
        if (E02 != null) {
            if (!this.isOpenedFromSearchedArticles) {
                E02.A0(8);
            }
            E02.invalidateOptionsMenu();
        }
        F0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SalesIQActivity E02 = E0();
        if (E02 != null) {
            E02.C0(false);
        }
    }

    public final void t0(boolean show) {
        if (show) {
            View view = this.bottomLayoutShadow;
            if (view != null) {
                view.setVisibility(0);
            }
            RelativeLayout relativeLayout = this.bottomViewLayout;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.setVisibility(0);
            return;
        }
        View view2 = this.bottomLayoutShadow;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.bottomViewLayout;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setVisibility(8);
    }

    public final void v0(ImageView normalView, ImageView selectionView, boolean dislike, int count) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(normalView, "alpha", 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new f(normalView, selectionView));
        Intrinsics.checkNotNull(selectionView);
        selectionView.setVisibility(0);
        if (dislike) {
            selectionView.setImageDrawable(this.disLikeDrawable);
        } else {
            selectionView.setImageDrawable(this.likeDrawable);
        }
        selectionView.setAlpha(0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(selectionView, "alpha", 1.0f);
        ofFloat2.setDuration(50L);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(selectionView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.2f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.2f, 1.0f));
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(selectionView, ViewProps.ROTATION, 0.0f, dislike ? -10.0f : 10.0f, 0.0f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofPropertyValuesHolder).with(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.addListener(new g(dislike, this, count));
        animatorSet.start();
    }

    public final void w0() {
        String str = this.articleId;
        if (str != null) {
            ArticleViewModel articleViewModel = this.articleViewModel;
            if (articleViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
                articleViewModel = null;
            }
            articleViewModel.j(str);
        }
    }

    public final SalesIQResource.Data x0() {
        ArticleViewModel articleViewModel = this.articleViewModel;
        if (articleViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewModel");
            articleViewModel = null;
        }
        return articleViewModel.getSalesIQArticle();
    }

    /* renamed from: y0, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    public final ImageView z0() {
        ImageView imageView = this.dislikeIconSelected;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dislikeIconSelected");
        return null;
    }
}
