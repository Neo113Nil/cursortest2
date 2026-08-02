package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class v3d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf b;
    public final /* synthetic */ NativeAd c;

    public /* synthetic */ v3d(pf pfVar, NativeAd nativeAd, int i) {
        this.a = i;
        this.b = pfVar;
        this.c = nativeAd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        NativeAd nativeAd = this.c;
        pf pfVar = this.b;
        switch (i2) {
            case 0:
                NativeAdView nativeAdView = (NativeAdView) obj;
                nativeAdView.getClass();
                Object tag = nativeAdView.getTag();
                utk utkVar = tag instanceof utk ? (utk) tag : null;
                if (utkVar != null) {
                    TextView textView = utkVar.f;
                    TextView textView2 = utkVar.g;
                    ImageView imageView = utkVar.c;
                    TextView textView3 = utkVar.d;
                    TextView textView4 = utkVar.b;
                    ConstraintLayout constraintLayout = utkVar.a;
                    MediaView mediaView = utkVar.e;
                    nativeAdView.setHeadlineView(textView2);
                    nativeAdView.setBodyView(textView4);
                    nativeAdView.setCallToActionView(textView3);
                    nativeAdView.setIconView(imageView);
                    nativeAdView.setAdvertiserView(textView);
                    nativeAdView.setMediaView(mediaView);
                    mediaView.setImageScaleType(ImageView.ScaleType.FIT_XY);
                    String str = pfVar.a;
                    String str2 = pfVar.c;
                    String str3 = pfVar.b;
                    MediaContent mediaContent = pfVar.f;
                    textView2.setText(str);
                    if (mediaContent != null) {
                        if (mediaContent.getAspectRatio() > 0.1d) {
                            mm3 mm3Var = new mm3();
                            mm3Var.e(constraintLayout);
                            mm3Var.o(mediaView.getId(), String.valueOf(mediaContent.getAspectRatio()));
                            mm3Var.a(constraintLayout);
                        } else if (mediaContent.hasVideoContent()) {
                            mm3 mm3Var2 = new mm3();
                            mm3Var2.e(constraintLayout);
                            mm3Var2.o(mediaView.getId(), "1:1");
                            mm3Var2.a(constraintLayout);
                        }
                        mediaView.setMediaContent(mediaContent);
                    }
                    if (str3 == null) {
                        textView4.setVisibility(8);
                        i = 0;
                    } else {
                        i = 0;
                        textView4.setVisibility(0);
                        textView4.setText(str3);
                    }
                    if (str2 == null) {
                        textView3.setVisibility(4);
                    } else {
                        textView3.setVisibility(i);
                        textView3.setText(str2);
                    }
                    Drawable drawable = pfVar.e;
                    if (drawable == null) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setImageDrawable(drawable);
                        imageView.setVisibility(i);
                    }
                    textView.setText(pfVar.d);
                    if (nativeAd != null) {
                        nativeAdView.setNativeAd(nativeAd);
                    }
                    break;
                } else {
                    break;
                }
            default:
                NativeAdView nativeAdView2 = (NativeAdView) obj;
                nativeAdView2.getClass();
                Object tag2 = nativeAdView2.getTag();
                vtk vtkVar = tag2 instanceof vtk ? (vtk) tag2 : null;
                if (vtkVar != null) {
                    TextView textView5 = vtkVar.e;
                    TextView textView6 = vtkVar.f;
                    ImageView imageView2 = vtkVar.c;
                    TextView textView7 = vtkVar.d;
                    TextView textView8 = vtkVar.b;
                    nativeAdView2.setHeadlineView(textView6);
                    nativeAdView2.setBodyView(textView8);
                    nativeAdView2.setCallToActionView(textView7);
                    nativeAdView2.setIconView(imageView2);
                    nativeAdView2.setAdvertiserView(textView5);
                    String str4 = pfVar.a;
                    String str5 = pfVar.c;
                    String str6 = pfVar.b;
                    textView6.setText(str4);
                    if (str6 == null) {
                        textView8.setVisibility(8);
                    } else {
                        textView8.setVisibility(0);
                        textView8.setText(str6);
                    }
                    if (str5 == null) {
                        textView7.setVisibility(4);
                    } else {
                        textView7.setVisibility(0);
                        textView7.setText(str5);
                    }
                    Drawable drawable2 = pfVar.e;
                    if (drawable2 == null) {
                        imageView2.setVisibility(8);
                    } else {
                        imageView2.setImageDrawable(drawable2);
                        imageView2.setVisibility(0);
                    }
                    textView5.setText(pfVar.d);
                    if (nativeAd != null) {
                        nativeAdView2.setNativeAd(nativeAd);
                    }
                    break;
                } else {
                    break;
                }
        }
        return Unit.a;
    }
}
