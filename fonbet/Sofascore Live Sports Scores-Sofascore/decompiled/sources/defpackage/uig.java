package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.io.encoding.Base64$PaddingOption;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uig {
    public hcc a;
    public final AlertDialog b;

    public uig(Context context, String str) {
        final wig wigVar = new wig(context);
        final int i = 1;
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        final int i2 = 0;
        layoutParams.setMargins(30, 0, 30, 0);
        wigVar.setLayoutParams(layoutParams);
        wigVar.setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(wigVar.getLayoutParams());
        linearLayout.setOrientation(0);
        Button button = new Button(context);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        button.setText("Why this ad?");
        button.setOnClickListener(new View.OnClickListener() { // from class: vig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                wig wigVar2 = wigVar;
                switch (i3) {
                    case 0:
                        Function0 function0 = wigVar2.b;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function02 = wigVar2.a;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout.addView(button);
        Button button2 = new Button(context);
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        button2.setText("Send feedback");
        button2.setOnClickListener(new View.OnClickListener() { // from class: vig
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                wig wigVar2 = wigVar;
                switch (i3) {
                    case 0:
                        Function0 function0 = wigVar2.b;
                        if (function0 != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                    default:
                        Function0 function02 = wigVar2.a;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        ColorStateList valueOf = ColorStateList.valueOf(Color.parseColor("#FE5000"));
        WeakHashMap weakHashMap = bsk.a;
        button2.setBackgroundTintList(valueOf);
        button2.setTextColor(-1);
        linearLayout.addView(button2);
        wigVar.addView(linearLayout);
        TextView textView = new TextView(context);
        textView.setText(String.format("(SDK version %s)", Arrays.copyOf(new Object[]{str}, 1)));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(applyDimension, applyDimension, applyDimension, applyDimension);
        Unit unit = Unit.a;
        wigVar.addView(textView, marginLayoutParams);
        wigVar.setSendFeedbackButtonClickedHandler(new Function0(this) { // from class: tig
            public final /* synthetic */ uig b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                uig uigVar = this.b;
                switch (i3) {
                    case 0:
                        hcc hccVar = uigVar.a;
                        if (hccVar != null) {
                            ((pig) hccVar.b).a((Context) hccVar.c);
                            AlertDialog alertDialog = ((uig) hccVar.d).b;
                            alertDialog.setOnDismissListener(null);
                            alertDialog.dismiss();
                        }
                        break;
                    default:
                        hcc hccVar2 = uigVar.a;
                        if (hccVar2 != null) {
                            pig pigVar = (pig) hccVar2.b;
                            String str2 = pigVar.k;
                            if (str2 != null) {
                                d01 d01Var = e01.e;
                                byte[] m = c.m(str2);
                                int length = m.length;
                                d01Var.getClass();
                                int length2 = m.length;
                                q4 q4Var = u4.Companion;
                                q4Var.getClass();
                                q4.a(0, length, length2);
                                int a = d01Var.a(length);
                                byte[] bArr = new byte[a];
                                int length3 = m.length;
                                q4Var.getClass();
                                q4.a(0, length, length3);
                                int a2 = d01Var.a(length);
                                if (a >= 0) {
                                    if (a2 < 0 || a2 > a) {
                                        zzl.r(dmi.k(a, a2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
                                        break;
                                    } else {
                                        byte[] bArr2 = d01Var.a ? f01.c : f01.a;
                                        int i4 = d01Var.b ? d01Var.d : Integer.MAX_VALUE;
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (true) {
                                            int i7 = i5 + 2;
                                            if (i7 >= length) {
                                                int i8 = length - i5;
                                                if (i8 == 1) {
                                                    int i9 = (m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                                                    bArr[i6] = bArr2[i9 >>> 6];
                                                    bArr[i6 + 1] = bArr2[i9 & 63];
                                                    Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
                                                    bArr[i6 + 2] = 61;
                                                    bArr[i6 + 3] = 61;
                                                    i5++;
                                                } else if (i8 == 2) {
                                                    int i10 = ((m[i5 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 2) | ((m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 10);
                                                    bArr[i6] = bArr2[i10 >>> 12];
                                                    bArr[i6 + 1] = bArr2[(i10 >>> 6) & 63];
                                                    bArr[i6 + 2] = bArr2[i10 & 63];
                                                    Base64$PaddingOption[] base64$PaddingOptionArr2 = Base64$PaddingOption.a;
                                                    bArr[i6 + 3] = 61;
                                                    i5 = i7;
                                                }
                                                if (i5 != length) {
                                                    a70.r("Check failed.");
                                                    break;
                                                } else {
                                                    pigVar.c.invoke(c.r(pigVar.l, "[metadata]", new String(bArr, Charsets.e), false));
                                                }
                                            } else {
                                                int min = Math.min((length - i5) / 3, i4);
                                                for (int i11 = 0; i11 < min; i11++) {
                                                    int i12 = m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    int i13 = i5 + 2;
                                                    int i14 = m[i5 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    i5 += 3;
                                                    int i15 = (m[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i14 << 8) | (i12 << 16);
                                                    bArr[i6] = bArr2[i15 >>> 18];
                                                    bArr[i6 + 1] = bArr2[(i15 >>> 12) & 63];
                                                    int i16 = i6 + 3;
                                                    bArr[i6 + 2] = bArr2[(i15 >>> 6) & 63];
                                                    i6 += 4;
                                                    bArr[i16] = bArr2[i15 & 63];
                                                }
                                                if (min == i4 && i5 != length) {
                                                    int i17 = i6 + 1;
                                                    byte[] bArr3 = e01.f;
                                                    bArr[i6] = bArr3[0];
                                                    i6 += 2;
                                                    bArr[i17] = bArr3[1];
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzl.r(ljg.j(a, "destination offset: 0, destination size: "));
                                    break;
                                }
                            }
                            ((uig) hccVar2.d).b.dismiss();
                        }
                        break;
                }
                return Unit.a;
            }
        });
        wigVar.setWhyThisAdButtonClickedHandler(new Function0(this) { // from class: tig
            public final /* synthetic */ uig b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                uig uigVar = this.b;
                switch (i3) {
                    case 0:
                        hcc hccVar = uigVar.a;
                        if (hccVar != null) {
                            ((pig) hccVar.b).a((Context) hccVar.c);
                            AlertDialog alertDialog = ((uig) hccVar.d).b;
                            alertDialog.setOnDismissListener(null);
                            alertDialog.dismiss();
                        }
                        break;
                    default:
                        hcc hccVar2 = uigVar.a;
                        if (hccVar2 != null) {
                            pig pigVar = (pig) hccVar2.b;
                            String str2 = pigVar.k;
                            if (str2 != null) {
                                d01 d01Var = e01.e;
                                byte[] m = c.m(str2);
                                int length = m.length;
                                d01Var.getClass();
                                int length2 = m.length;
                                q4 q4Var = u4.Companion;
                                q4Var.getClass();
                                q4.a(0, length, length2);
                                int a = d01Var.a(length);
                                byte[] bArr = new byte[a];
                                int length3 = m.length;
                                q4Var.getClass();
                                q4.a(0, length, length3);
                                int a2 = d01Var.a(length);
                                if (a >= 0) {
                                    if (a2 < 0 || a2 > a) {
                                        zzl.r(dmi.k(a, a2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
                                        break;
                                    } else {
                                        byte[] bArr2 = d01Var.a ? f01.c : f01.a;
                                        int i4 = d01Var.b ? d01Var.d : Integer.MAX_VALUE;
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (true) {
                                            int i7 = i5 + 2;
                                            if (i7 >= length) {
                                                int i8 = length - i5;
                                                if (i8 == 1) {
                                                    int i9 = (m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                                                    bArr[i6] = bArr2[i9 >>> 6];
                                                    bArr[i6 + 1] = bArr2[i9 & 63];
                                                    Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.a;
                                                    bArr[i6 + 2] = 61;
                                                    bArr[i6 + 3] = 61;
                                                    i5++;
                                                } else if (i8 == 2) {
                                                    int i10 = ((m[i5 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 2) | ((m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 10);
                                                    bArr[i6] = bArr2[i10 >>> 12];
                                                    bArr[i6 + 1] = bArr2[(i10 >>> 6) & 63];
                                                    bArr[i6 + 2] = bArr2[i10 & 63];
                                                    Base64$PaddingOption[] base64$PaddingOptionArr2 = Base64$PaddingOption.a;
                                                    bArr[i6 + 3] = 61;
                                                    i5 = i7;
                                                }
                                                if (i5 != length) {
                                                    a70.r("Check failed.");
                                                    break;
                                                } else {
                                                    pigVar.c.invoke(c.r(pigVar.l, "[metadata]", new String(bArr, Charsets.e), false));
                                                }
                                            } else {
                                                int min = Math.min((length - i5) / 3, i4);
                                                for (int i11 = 0; i11 < min; i11++) {
                                                    int i12 = m[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    int i13 = i5 + 2;
                                                    int i14 = m[i5 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                                    i5 += 3;
                                                    int i15 = (m[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (i14 << 8) | (i12 << 16);
                                                    bArr[i6] = bArr2[i15 >>> 18];
                                                    bArr[i6 + 1] = bArr2[(i15 >>> 12) & 63];
                                                    int i16 = i6 + 3;
                                                    bArr[i6 + 2] = bArr2[(i15 >>> 6) & 63];
                                                    i6 += 4;
                                                    bArr[i16] = bArr2[i15 & 63];
                                                }
                                                if (min == i4 && i5 != length) {
                                                    int i17 = i6 + 1;
                                                    byte[] bArr3 = e01.f;
                                                    bArr[i6] = bArr3[0];
                                                    i6 += 2;
                                                    bArr[i17] = bArr3[1];
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzl.r(ljg.j(a, "destination offset: 0, destination size: "));
                                    break;
                                }
                            }
                            ((uig) hccVar2.d).b.dismiss();
                        }
                        break;
                }
                return Unit.a;
            }
        });
        this.b = new AlertDialog.Builder(context).setView(wigVar).setTitle("Ads powered by EQUATIV").setOnDismissListener(new j0(this, 5)).create();
    }
}
