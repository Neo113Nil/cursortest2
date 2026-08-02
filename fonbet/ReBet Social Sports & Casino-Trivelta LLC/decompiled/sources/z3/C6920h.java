package z3;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.airbnb.lottie.AbstractC2932b;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.S;
import com.airbnb.lottie.Z;
import com.airbnb.lottie.a0;
import com.airbnb.lottie.b0;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.RNLog;
import com.facebook.react.views.text.ReactFontManager;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: z3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6920h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f68538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68539b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68540c;

    /* renamed from: d, reason: collision with root package name */
    public String f68541d;

    /* renamed from: e, reason: collision with root package name */
    public ImageView.ScaleType f68542e;

    /* renamed from: f, reason: collision with root package name */
    public String f68543f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f68544g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f68545h;

    /* renamed from: i, reason: collision with root package name */
    public ReadableArray f68546i;

    /* renamed from: j, reason: collision with root package name */
    public ReadableArray f68547j;

    /* renamed from: k, reason: collision with root package name */
    public Z f68548k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f68549l;

    /* renamed from: m, reason: collision with root package name */
    public String f68550m;

    /* renamed from: n, reason: collision with root package name */
    public String f68551n;

    /* renamed from: o, reason: collision with root package name */
    public String f68552o;

    /* renamed from: p, reason: collision with root package name */
    public Float f68553p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f68554q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f68555r;

    /* renamed from: s, reason: collision with root package name */
    public Float f68556s;

    /* renamed from: z3.h$a */
    public static final class a extends AbstractC2932b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f68557a;

        public a(LottieAnimationView lottieAnimationView) {
            this.f68557a = lottieAnimationView;
        }

        @Override // com.airbnb.lottie.AbstractC2932b
        public Typeface a(String fontFamily) {
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            ReactFontManager companion = ReactFontManager.INSTANCE.getInstance();
            AssetManager assets = this.f68557a.getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            return companion.getTypeface(fontFamily, -1, -1, assets);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        
            if (r5.equals("Regular") == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        
            r4 = 400;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        
            if (r5.equals(com.facebook.react.views.progressbar.ReactProgressBarViewManager.DEFAULT_STYLE) == false) goto L29;
         */
        @Override // com.airbnb.lottie.AbstractC2932b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Typeface b(String fontFamily, String fontStyle, String fontName) {
            int i10;
            Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
            Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
            Intrinsics.checkNotNullParameter(fontName, "fontName");
            switch (fontStyle.hashCode()) {
                case -1994163307:
                    if (fontStyle.equals("Medium")) {
                        i10 = FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
                        break;
                    }
                    i10 = -1;
                    break;
                case -1955878649:
                    break;
                case -1543850116:
                    break;
                case 2076325:
                    if (fontStyle.equals("Bold")) {
                        i10 = ReactFontManager.TypefaceStyle.BOLD;
                        break;
                    }
                    i10 = -1;
                    break;
                case 2605753:
                    if (fontStyle.equals("Thin")) {
                        i10 = 100;
                        break;
                    }
                    i10 = -1;
                    break;
                case 64266207:
                    if (fontStyle.equals("Black")) {
                        i10 = 900;
                        break;
                    }
                    i10 = -1;
                    break;
                case 73417974:
                    if (fontStyle.equals("Light")) {
                        i10 = 200;
                        break;
                    }
                    i10 = -1;
                    break;
                default:
                    i10 = -1;
                    break;
            }
            com.facebook.react.views.text.ReactFontManager companion = com.facebook.react.views.text.ReactFontManager.INSTANCE.getInstance();
            AssetManager assets = this.f68557a.getContext().getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            return companion.getTypeface(fontName, -1, i10, assets);
        }
    }

    public C6920h(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f68539b = "lottie-react-native";
        this.f68538a = new WeakReference(view);
        view.setFontAssetDelegate(new a(view));
    }

    public final void a() {
        Object m147constructorimpl;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f68538a.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.f68547j;
        if (readableArray != null && readableArray.size() > 0) {
            b0 b0Var = new b0(lottieAnimationView);
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map != null) {
                    b0Var.e(map.getString("find"), map.getString("replace"));
                }
            }
            lottieAnimationView.setTextDelegate(b0Var);
        }
        String str = this.f68550m;
        if (str != null) {
            lottieAnimationView.z(str, String.valueOf(str.hashCode()));
            this.f68550m = null;
        }
        String str2 = this.f68551n;
        if (str2 != null) {
            File file = new File(str2);
            if (file.exists()) {
                lottieAnimationView.x(new FileInputStream(file), String.valueOf(str2.hashCode()));
            } else {
                lottieAnimationView.A(str2, String.valueOf(str2.hashCode()));
            }
            this.f68551n = null;
        }
        String str3 = this.f68552o;
        if (str3 != null) {
            File file2 = new File(str3);
            if (file2.exists()) {
                lottieAnimationView.y(new ZipInputStream(new FileInputStream(file2)), String.valueOf(str3.hashCode()));
                this.f68552o = null;
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(Uri.parse(str3).getScheme());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            String str4 = (String) m147constructorimpl;
            if (str4 != null) {
                if (Intrinsics.areEqual(str4, "file")) {
                    String path = Uri.parse(str3).getPath();
                    if (path != null) {
                        lottieAnimationView.y(new ZipInputStream(new FileInputStream(new File(path))), String.valueOf(str3.hashCode()));
                    } else {
                        Log.w(this.f68539b, "URI path is null for asset: " + str3);
                    }
                } else {
                    lottieAnimationView.setAnimationFromUrl(str3);
                }
                this.f68552o = null;
                return;
            }
            int identifier = lottieAnimationView.getResources().getIdentifier(str3, "raw", lottieAnimationView.getContext().getPackageName());
            if (identifier == 0) {
                RNLog.e("Animation for " + str3 + " was not found in raw resources");
                return;
            }
            lottieAnimationView.setAnimation(identifier);
            this.f68540c = false;
            this.f68552o = null;
        }
        if (this.f68540c) {
            lottieAnimationView.setAnimation(this.f68541d);
            this.f68540c = false;
        }
        Float f10 = this.f68553p;
        if (f10 != null) {
            lottieAnimationView.setProgress(f10.floatValue());
            this.f68553p = null;
        }
        Boolean bool = this.f68554q;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f68554q = null;
        }
        Boolean bool2 = this.f68555r;
        if (bool2 != null && bool2.booleanValue() && !lottieAnimationView.s()) {
            lottieAnimationView.u();
        }
        Float f11 = this.f68556s;
        if (f11 != null) {
            lottieAnimationView.setSpeed(f11.floatValue());
            this.f68556s = null;
        }
        ImageView.ScaleType scaleType = this.f68542e;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.f68542e = null;
        }
        Z z10 = this.f68548k;
        if (z10 != null) {
            lottieAnimationView.setRenderMode(z10);
            this.f68548k = null;
        }
        Integer num = this.f68549l;
        if (num != null) {
            lottieAnimationView.setLayerType(num.intValue(), null);
        }
        String str5 = this.f68543f;
        if (str5 != null) {
            lottieAnimationView.setImageAssetsFolder(str5);
            this.f68543f = null;
        }
        Boolean bool3 = this.f68544g;
        if (bool3 != null) {
            lottieAnimationView.o(bool3.booleanValue());
            this.f68544g = null;
        }
        Boolean bool4 = this.f68545h;
        if (bool4 != null) {
            lottieAnimationView.setSafeMode(bool4.booleanValue());
            this.f68545h = null;
        }
        ReadableArray readableArray2 = this.f68546i;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        int size2 = readableArray2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ReadableMap map2 = readableArray2.getMap(i11);
            if (map2 != null) {
                b(map2, lottieAnimationView);
            }
        }
    }

    public final void b(ReadableMap readableMap, LottieAnimationView lottieAnimationView) {
        int i10;
        List emptyList;
        if (readableMap.getType(ViewProps.COLOR) == ReadableType.Map) {
            ReadableMap map = readableMap.getMap(ViewProps.COLOR);
            Context context = lottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer color = ColorPropConverter.getColor(map, context);
            i10 = color != null ? color.intValue() : 0;
        } else {
            i10 = readableMap.getInt(ViewProps.COLOR);
        }
        String str = readableMap.getString("keypath") + ".**";
        String quote = Pattern.quote(".");
        Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
        List<String> split = new Regex(quote).split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        String[] strArr = (String[]) emptyList.toArray(new String[0]);
        lottieAnimationView.k(new E3.e((String[]) Arrays.copyOf(strArr, strArr.length)), S.f28453N, new G3.c(new a0(i10)));
    }

    public final void c(String str) {
        this.f68550m = str;
    }

    public final void d(String str) {
        this.f68541d = str;
        this.f68540c = true;
    }

    public final void e(String str) {
        this.f68551n = str;
    }

    public final void f(Boolean bool) {
        this.f68555r = bool;
    }

    public final void g(ReadableArray readableArray) {
        this.f68546i = readableArray;
    }

    public final void h(Boolean bool) {
        this.f68544g = bool;
    }

    public final void i(Boolean bool) {
        this.f68545h = bool;
    }

    public final void j(String str) {
        this.f68543f = str;
    }

    public final void k(Integer num) {
        this.f68549l = num;
    }

    public final void l(Boolean bool) {
        this.f68554q = bool;
    }

    public final void m(Float f10) {
        this.f68553p = f10;
    }

    public final void n(Z z10) {
        this.f68548k = z10;
    }

    public final void o(ImageView.ScaleType scaleType) {
        this.f68542e = scaleType;
    }

    public final void p(String str) {
        this.f68552o = str;
    }

    public final void q(Float f10) {
        this.f68556s = f10;
    }

    public final void r(ReadableArray readableArray) {
        this.f68547j = readableArray;
    }
}
