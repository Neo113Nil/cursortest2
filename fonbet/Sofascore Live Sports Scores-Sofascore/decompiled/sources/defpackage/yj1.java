package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.container.tabs.BlazeMomentsPlayerContainerTabs;
import com.blaze.blazesdk.features.moments.widgets.grid.BlazeMomentsWidgetGridView;
import com.blaze.blazesdk.features.moments.widgets.row.BlazeMomentsWidgetRowView;
import com.blaze.blazesdk.features.stories.widgets.grid.BlazeStoriesWidgetGridView;
import com.blaze.blazesdk.features.stories.widgets.row.BlazeStoriesWidgetRowView;
import com.blaze.blazesdk.features.videos.widgets.grid.BlazeVideosWidgetGridView;
import com.blaze.blazesdk.features.videos.widgets.row.BlazeVideosWidgetRowView;
import com.blaze.blazesdk.follow.BlazeFollowEntityView;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.chat.ChatTranslateActivity;
import com.sofascore.results.chat.addcountry.ChatCountryFlagBottomSheet;
import com.sofascore.results.mvvm.base.CollapsibleToolbarActivity;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import com.sofascore.results.view.ToolbarBackgroundAppBarLayout;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import com.sofascore.results.view.header.CollapsibleSmallHeaderView;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yj1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        OddsCountryProvider oddsCountryProvider;
        xe6 xe6Var;
        pw1 pw1Var;
        Context context;
        Bitmap createBitmap;
        int i;
        int min;
        double max;
        int px_delegate$lambda$0;
        BroadcastReceiver playerInContainerBroadcast_delegate$lambda$0;
        yim tabsViewModel_delegate$lambda$1;
        Drawable drawable;
        int i2;
        Unit unit;
        int headerBiddingTokenCounter;
        int i3 = this.a;
        int i4 = R.id.toolbar;
        int i5 = 0;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((qk1) obj2).u(new z91(true));
                return Unit.a;
            case 1:
                Function0 function0 = ((wm1) obj2).f;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 2:
                return (q80) obj2;
            case 3:
                Context context2 = ((r71) obj2).b;
                context2.getClass();
                for (Object obj3 : xld.b(context2)) {
                    String slug = ((OddsCountryProvider) obj3).getProvider().getSlug();
                    slug.getClass();
                    if (StringsKt.J(slug, "bet365", false) || StringsKt.J(slug, "bet-365", false)) {
                        obj = obj3;
                        oddsCountryProvider = (OddsCountryProvider) obj;
                        if (oddsCountryProvider != null || (r1 = oddsCountryProvider.getDefaultBetSlipLink()) == null) {
                            String str = "";
                        }
                        bea.G(context2, str);
                        nv.a0(context2, "provider_logo");
                        return Unit.a;
                    }
                }
                obj = null;
                oddsCountryProvider = (OddsCountryProvider) obj;
                if (oddsCountryProvider != null) {
                }
                String str2 = "";
                bea.G(context2, str2);
                nv.a0(context2, "provider_logo");
                return Unit.a;
            case 4:
                uw1 uw1Var = (uw1) obj2;
                BitmapFactory.Options options = new BitmapFactory.Options();
                tvd tvdVar = uw1Var.b;
                pw1 pw1Var2 = new pw1(uw1Var.a.source(), i5);
                lof lofVar = new lof(pw1Var2);
                options.inJustDecodeBounds = true;
                int i6 = 4;
                BitmapFactory.decodeStream(new oy1(lofVar.h(), i6), null, options);
                Exception exc = pw1Var2.c;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = jf6.a;
                String str3 = options.outMimeType;
                uw1Var.d.getClass();
                if (str3 != null && (str3.equals("image/jpeg") || str3.equals("image/webp") || str3.equals("image/heic") || str3.equals("image/heif"))) {
                    ef6 ef6Var = new ef6(new gf6(new oy1(lofVar.h(), i6), 0));
                    int c = ef6Var.c();
                    xe6Var = new xe6(c == 2 || c == 7 || c == 4 || c == 5, ef6Var.l());
                } else {
                    xe6Var = xe6.c;
                }
                int i7 = xe6Var.b;
                boolean z = xe6Var.a;
                Exception exc2 = pw1Var2.c;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace d = vt9.d(tvdVar);
                Context context3 = tvdVar.a;
                if (d != null) {
                    options.inPreferredColorSpace = (ColorSpace) fqj.x(tvdVar, vt9.c);
                }
                options.inPremultiplied = ((Boolean) fqj.x(tvdVar, vt9.d)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) fqj.x(tvdVar, vt9.b);
                if ((z || i7 > 0) && (config == null || pco.H(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) fqj.x(tvdVar, vt9.g)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.c(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i8 = options.outWidth;
                if (i8 <= 0 || (i = options.outHeight) <= 0) {
                    pw1Var = pw1Var2;
                    context = context3;
                    options.inSampleSize = 1;
                    options.inScaled = false;
                } else {
                    int i9 = (i7 == 90 || i7 == 270) ? i : i8;
                    if (i7 != 90 && i7 != 270) {
                        i8 = i;
                    }
                    kjh kjhVar = tvdVar.b;
                    jrg jrgVar = tvdVar.c;
                    sl6 sl6Var = st9.b;
                    long q = tol.q(i9, i8, kjhVar, jrgVar, (kjh) fqj.x(tvdVar, sl6Var));
                    context = context3;
                    int i10 = (int) (q >> 32);
                    int i11 = (int) (q & 4294967295L);
                    int highestOneBit = Integer.highestOneBit(i9 / i10);
                    int highestOneBit2 = Integer.highestOneBit(i8 / i11);
                    int ordinal = jrgVar.ordinal();
                    if (ordinal == 0) {
                        min = Math.min(highestOneBit, highestOneBit2);
                    } else {
                        if (ordinal != 1) {
                            zzl.b();
                            return null;
                        }
                        min = Math.max(highestOneBit, highestOneBit2);
                    }
                    if (min < 1) {
                        min = 1;
                    }
                    options.inSampleSize = min;
                    pw1Var = pw1Var2;
                    double d2 = min;
                    double d3 = i9 / d2;
                    double d4 = i8 / d2;
                    kjh kjhVar2 = (kjh) fqj.x(tvdVar, sl6Var);
                    double d5 = i10 / d3;
                    double d6 = i11 / d4;
                    int ordinal2 = jrgVar.ordinal();
                    if (ordinal2 == 0) {
                        max = Math.max(d5, d6);
                    } else {
                        if (ordinal2 != 1) {
                            zzl.b();
                            return null;
                        }
                        max = Math.min(d5, d6);
                    }
                    if (kjhVar2.a instanceof t25) {
                        double d7 = ((t25) r6).a / d3;
                        if (max > d7) {
                            max = d7;
                        }
                    }
                    if (kjhVar2.b instanceof t25) {
                        double d8 = ((t25) r0).a / d4;
                        if (max > d8) {
                            max = d8;
                        }
                    }
                    if (tvdVar.d == e3f.b && max > 1.0d) {
                        max = 1.0d;
                    }
                    boolean z2 = max == 1.0d;
                    options.inScaled = !z2;
                    if (!z2) {
                        if (max > 1.0d) {
                            options.inDensity = wzb.a(2.147483647E9d / max);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = wzb.a(2.147483647E9d * max);
                        }
                    }
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new oy1(lofVar, 4), null, options);
                    lofVar.close();
                    Exception exc3 = pw1Var.c;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (decodeStream == null) {
                        a70.r("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z || i7 > 0) {
                        Matrix matrix = new Matrix();
                        float width = decodeStream.getWidth() / 2.0f;
                        float height = decodeStream.getHeight() / 2.0f;
                        if (z) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i7 > 0) {
                            matrix.postRotate(i7, width, height);
                        }
                        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, decodeStream.getWidth(), decodeStream.getHeight());
                        matrix.mapRect(rectF);
                        float f = rectF.left;
                        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || rectF.top != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i7 == 90 || i7 == 270) {
                            int height2 = decodeStream.getHeight();
                            int width2 = decodeStream.getWidth();
                            Bitmap.Config config4 = decodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = decodeStream.getWidth();
                            int height3 = decodeStream.getHeight();
                            Bitmap.Config config5 = decodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(createBitmap).drawBitmap(decodeStream, matrix, jf6.a);
                        decodeStream.recycle();
                        decodeStream = createBitmap;
                    }
                    return new vl4(rfo.u(new BitmapDrawable(context.getResources(), decodeStream)), options.inSampleSize > 1 || options.inScaled);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n4o.x(lofVar, th);
                        throw th2;
                    }
                }
            case 5:
                px_delegate$lambda$0 = BlazeDp.toPx_delegate$lambda$0((BlazeDp) obj2);
                return Integer.valueOf(px_delegate$lambda$0);
            case 6:
                BlazeDp blazeDp = BlazeFollowEntityView.e;
                ((BlazeFollowEntityView) obj2).setVisibility(8);
                return Unit.a;
            case 7:
                playerInContainerBroadcast_delegate$lambda$0 = BlazeMomentsPlayerContainer.playerInContainerBroadcast_delegate$lambda$0((BlazeMomentsPlayerContainer) obj2);
                return playerInContainerBroadcast_delegate$lambda$0;
            case 8:
                tabsViewModel_delegate$lambda$1 = BlazeMomentsPlayerContainerTabs.tabsViewModel_delegate$lambda$1((BlazeMomentsPlayerContainerTabs) obj2);
                return tabsViewModel_delegate$lambda$1;
            case 9:
                int i12 = BlazeMomentsWidgetGridView.w;
                return new aql(((BlazeMomentsWidgetGridView) obj2).getWidgetLayout());
            case 10:
                int i13 = BlazeMomentsWidgetRowView.w;
                return new e2m(((BlazeMomentsWidgetRowView) obj2).getWidgetLayout());
            case 11:
                int i14 = BlazeStoriesWidgetGridView.w;
                return new aql(((BlazeStoriesWidgetGridView) obj2).getWidgetLayout());
            case 12:
                int i15 = BlazeStoriesWidgetRowView.w;
                return new e2m(((BlazeStoriesWidgetRowView) obj2).getWidgetLayout());
            case 13:
                int i16 = BlazeVideosWidgetGridView.w;
                return new aql(((BlazeVideosWidgetGridView) obj2).getWidgetLayout());
            case 14:
                int i17 = BlazeVideosWidgetRowView.w;
                return new e2m(((BlazeVideosWidgetRowView) obj2).getWidgetLayout());
            case 15:
                return Boolean.valueOf(((o12) obj2).q);
            case 16:
                return (oqf) obj2;
            case 17:
                View root = ((d92) obj2).getRoot();
                RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.buzzer_recycler, root);
                if (recyclerView != null) {
                    return new a92((LinearLayout) root, recyclerView);
                }
                yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.buzzer_recycler)));
                return null;
            case 18:
                ((ChatCountryFlagBottomSheet) obj2).j();
                return Unit.a;
            case 19:
                mr2 mr2Var = (mr2) obj2;
                Context context4 = mr2Var.b;
                Drawable drawable2 = context4.getDrawable(R.drawable.sofascore_spotlight_logo_bg);
                if (drawable2 == null || (drawable = context4.getDrawable(R.drawable.ic_sofascore_2)) == null) {
                    return null;
                }
                int i18 = mr2Var.n;
                Bitmap createBitmap2 = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                createBitmap2.getClass();
                Canvas canvas = new Canvas(createBitmap2);
                drawable2.setBounds(0, 0, i18, i18);
                drawable2.draw(canvas);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i19 = (int) (i18 * 0.75d);
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    i2 = i19;
                } else {
                    float f2 = intrinsicWidth / intrinsicHeight;
                    float f3 = i19;
                    float f4 = f3 / f2;
                    if (f4 > f3) {
                        i19 = (int) (f3 * f2);
                        i2 = i19;
                    } else {
                        i2 = (int) f4;
                    }
                }
                int i20 = (i18 - i19) / 2;
                int i21 = (i18 - i2) / 2;
                drawable.setBounds(i20, i21, i19 + i20, i2 + i21);
                drawable.draw(canvas);
                Resources resources = context4.getResources();
                resources.getClass();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, createBitmap2);
                bitmapDrawable.setBounds(0, 0, i18, i18);
                return bitmapDrawable;
            case 20:
                int i22 = ChatTranslateActivity.M;
                View inflate = ((ChatTranslateActivity) obj2).getLayoutInflater().inflate(R.layout.chat_translate_activity, (ViewGroup) null, false);
                int i23 = R.id.button_add_language;
                TextView textView = (TextView) nq8.B(R.id.button_add_language, inflate);
                if (textView != null) {
                    i23 = R.id.exclude_list;
                    RadioGroup radioGroup = (RadioGroup) nq8.B(R.id.exclude_list, inflate);
                    if (radioGroup != null) {
                        View B = nq8.B(R.id.toolbar, inflate);
                        if (B != null) {
                            z3f.b(B);
                            i4 = R.id.translate_language;
                            RadioGroup radioGroup2 = (RadioGroup) nq8.B(R.id.translate_language, inflate);
                            if (radioGroup2 != null) {
                                return new ls2((LinearLayout) inflate, textView, radioGroup, radioGroup2);
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                        return null;
                    }
                }
                i4 = i23;
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                return null;
            case 21:
                return Float.valueOf(((Number) ((q50) obj2).d()).floatValue());
            case 22:
                int i24 = CollapsibleProfileHeaderView.c;
                ViewParent parent = ((CollapsibleProfileHeaderView) obj2).getParent().getParent();
                if (parent instanceof AppBarLayout) {
                    return (AppBarLayout) parent;
                }
                return null;
            case 23:
                int i25 = CollapsibleProfileHeaderView.c;
                ((sfk) obj2).invoke();
                return Unit.a;
            case 24:
                int i26 = CollapsibleProfileHeaderView.c;
                ((sfk) obj2).invoke();
                return Unit.a;
            case 25:
                int i27 = CollapsibleSmallHeaderView.h;
                ViewParent parent2 = ((CollapsibleSmallHeaderView) obj2).getParent().getParent();
                if (parent2 instanceof AppBarLayout) {
                    return (AppBarLayout) parent2;
                }
                return null;
            case 26:
                int i28 = CollapsibleToolbarActivity.K;
                View inflate2 = ((CollapsibleToolbarActivity) obj2).getLayoutInflater().inflate(R.layout.activity_collapsible_header_toolbar, (ViewGroup) null, false);
                int i29 = R.id.ad_banner_view;
                AdBannerView adBannerView = (AdBannerView) nq8.B(R.id.ad_banner_view, inflate2);
                if (adBannerView != null) {
                    i29 = R.id.ad_container;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.ad_container, inflate2);
                    if (linearLayout != null) {
                        i29 = R.id.app_bar;
                        ToolbarBackgroundAppBarLayout toolbarBackgroundAppBarLayout = (ToolbarBackgroundAppBarLayout) nq8.B(R.id.app_bar, inflate2);
                        if (toolbarBackgroundAppBarLayout != null) {
                            i29 = R.id.collapsing_space;
                            if (((Space) nq8.B(R.id.collapsing_space, inflate2)) != null) {
                                i29 = R.id.collapsing_toolbar;
                                if (((CollapsingToolbarLayout) nq8.B(R.id.collapsing_toolbar, inflate2)) != null) {
                                    i29 = R.id.floating_action_button;
                                    ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) nq8.B(R.id.floating_action_button, inflate2);
                                    if (extendedFloatingActionButton != null) {
                                        i29 = R.id.header_container;
                                        if (((CollapsibleSmallHeaderView) nq8.B(R.id.header_container, inflate2)) != null) {
                                            i29 = R.id.header_view;
                                            View B2 = nq8.B(R.id.header_view, inflate2);
                                            if (B2 != null) {
                                                bu1 b = bu1.b(B2);
                                                i29 = R.id.info_banner;
                                                if (((ViewStub) nq8.B(R.id.info_banner, inflate2)) != null) {
                                                    i29 = R.id.no_internet_view;
                                                    ViewStub viewStub = (ViewStub) nq8.B(R.id.no_internet_view, inflate2);
                                                    if (viewStub != null) {
                                                        i29 = R.id.tabs;
                                                        SofaTabLayout sofaTabLayout = (SofaTabLayout) nq8.B(R.id.tabs, inflate2);
                                                        if (sofaTabLayout != null) {
                                                            UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) nq8.B(R.id.toolbar, inflate2);
                                                            if (underlinedToolbar != null) {
                                                                i4 = R.id.transparent_layer;
                                                                View B3 = nq8.B(R.id.transparent_layer, inflate2);
                                                                if (B3 != null) {
                                                                    i4 = R.id.view_pager;
                                                                    ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate2);
                                                                    if (viewPager2 != null) {
                                                                        i4 = R.id.viewpager_container;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.viewpager_container, inflate2);
                                                                        if (swipeRefreshLayout != null) {
                                                                            return new vc((RelativeLayout) inflate2, adBannerView, linearLayout, toolbarBackgroundAppBarLayout, extendedFloatingActionButton, b, viewStub, sofaTabLayout, underlinedToolbar, B3, viewPager2, swipeRefreshLayout);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                                                            return null;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i4 = i29;
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                return null;
            case 27:
                return ((Iterable) obj2).iterator();
            case 28:
                unit = CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4((CommonInitAwaitingGetHeaderBiddingToken) obj2);
                return unit;
            default:
                headerBiddingTokenCounter = ((SessionRepository) obj2).getHeaderBiddingTokenCounter();
                return Integer.valueOf(headerBiddingTokenCounter);
        }
    }
}
