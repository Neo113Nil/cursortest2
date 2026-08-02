package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.ktor.util.date.GMTDateParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class x<T> extends u<WebView, T> {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ja f3223;

    /* renamed from: ｋ, reason: contains not printable characters */
    private z f3225;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private Map<T, z> f3226 = new WeakHashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private x<T>.a f3224 = new a();

    /* renamed from: ﻐ */
    abstract View mo5783(T t);

    /* renamed from: ﾇ */
    abstract t<WebView, T> mo5788();

    /* renamed from: ﾇ */
    abstract void mo5789(T t, List<WebView> list);

    /* renamed from: ﾒ */
    abstract z mo5790();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final /* synthetic */ void mo5823(JSONObject jSONObject, Object obj, Object obj2) {
        super.mo5820(jSONObject, (JSONObject) obj, (WebView) obj2);
    }

    public x(ja jaVar) {
        this.f3223 = jaVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8649(ja jaVar) {
        this.f3223 = jaVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m8651(x<T>.a aVar) {
        this.f3224 = aVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    void mo8653(T t, String str) {
        m8650(IronSourceNetworkBridge.jsonObjectInit(), (JSONObject) t, str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8650(final JSONObject jSONObject, final T t, String str) {
        z zVar;
        boolean z = ((a) this.f3224).f3243 && !TextUtils.isEmpty(((a) this.f3224).f3245);
        if (((a) this.f3224).f3238) {
            zVar = this.f3226.get(t);
        } else {
            zVar = this.f3225;
        }
        if (zVar == null) {
            zVar = mo5790();
            if (((a) this.f3224).f3238) {
                this.f3226.put(t, zVar);
            } else {
                this.f3225 = zVar;
            }
            zVar.m8631(mo5788());
        }
        z zVar2 = zVar;
        zVar2.m8735();
        zVar2.m8732(((a) this.f3224).f3245, ((a) this.f3224).f3242, z, ((a) this.f3224).f3241, ((a) this.f3224).f3239);
        zVar2.m8737(str);
        if (((a) this.f3224).f3237) {
            ArrayList arrayList = new ArrayList();
            mo5789((x<T>) t, (List<WebView>) arrayList);
            List<WebView> arrayList2 = new ArrayList<>();
            ja jaVar = this.f3223;
            if (jaVar != null) {
                arrayList2 = jaVar.mo7217(t);
            }
            final List<WebView> m8358 = ke.m8358(arrayList, arrayList2);
            if (m8358.isEmpty() || ((a) this.f3224).f3240) {
                View mo5783 = mo5783((x<T>) t);
                if (mo5783 != null) {
                    mo5783.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3227 = 1;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static char[] f3228 = {'k', 206, 205, 206, 200, 204, 186, 181, 185, Typography.middleDot, 202, 204, 203, 203, 206, 191, 192, 211, 207, 128, 'S', GMTDateParser.SECONDS, AbstractJsonLexerKt.UNICODE_ESC, '|', 'o', 'v', 'Q', 130, 131, AbstractJsonLexerKt.END_OBJ, 135, 'o', 'Z', '|', AbstractJsonLexerKt.END_OBJ, '.', '|', 'w', '.', 128, AbstractJsonLexerKt.END_OBJ, 128};

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3229;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = 2 % 2;
                            Object obj = null;
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                x.this.mo5789((x) t, (List<WebView>) arrayList3);
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                int i10 = f3227 + 57;
                                f3229 = i10 % 128;
                                int i11 = i10 % 2;
                                View mo57832 = x.this.mo5783((x) t);
                                if (mo57832 != null && (!x.this.f3224.f3240)) {
                                    int i12 = f3229 + 57;
                                    f3227 = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        mo57832.removeOnLayoutChangeListener(this);
                                        super.hashCode();
                                        throw null;
                                    }
                                    mo57832.removeOnLayoutChangeListener(this);
                                }
                                x.this.m8648((x) t, (List<WebView>) arrayList3);
                                x.this.mo5825(IronSourceNetworkBridge.jsonObjectInit(), arrayList3.get(0), t);
                            } catch (Throwable th) {
                                kl.m8458(m8654("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{0, 19, 99, 15}, false).intern(), m8654(null, new int[]{19, 23, 14, 2}, true).intern(), th, false);
                            }
                        }

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static String m8654(String str2, int[] iArr, boolean z2) {
                            String str3;
                            byte[] bArr = str2;
                            if (str2 != null) {
                                bArr = str2.getBytes(C.ISO88591_NAME);
                            }
                            byte[] bArr2 = bArr;
                            synchronized (h.f2286) {
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int i3 = iArr[2];
                                int i4 = iArr[3];
                                char[] cArr = new char[i2];
                                System.arraycopy(f3228, i, cArr, 0, i2);
                                if (bArr2 != null) {
                                    char[] cArr2 = new char[i2];
                                    h.f2287 = 0;
                                    char c = 0;
                                    while (h.f2287 < i2) {
                                        if (bArr2[h.f2287] == 1) {
                                            cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c);
                                        } else {
                                            cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c);
                                        }
                                        c = cArr2[h.f2287];
                                        h.f2287++;
                                    }
                                    cArr = cArr2;
                                }
                                if (i4 > 0) {
                                    char[] cArr3 = new char[i2];
                                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                                    int i5 = i2 - i4;
                                    System.arraycopy(cArr3, 0, cArr, i5, i4);
                                    System.arraycopy(cArr3, i4, cArr, 0, i5);
                                }
                                if (z2) {
                                    char[] cArr4 = new char[i2];
                                    h.f2287 = 0;
                                    while (h.f2287 < i2) {
                                        cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                                        h.f2287++;
                                    }
                                    cArr = cArr4;
                                }
                                if (i3 > 0) {
                                    h.f2287 = 0;
                                    while (h.f2287 < i2) {
                                        cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                                        h.f2287++;
                                    }
                                }
                                str3 = new String(cArr);
                            }
                            return str3;
                        }
                    });
                }
                if (m8358.isEmpty()) {
                    super.mo5823(jSONObject, null, t);
                    return;
                }
            }
            if (!((a) this.f3224).f3236) {
                m8648((x<T>) t, m8358);
                super.mo5823(jSONObject, m8358.get(0), t);
                return;
            } else {
                p.m8556().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.m8648((x) t, (List<WebView>) m8358);
                        x.super.mo5823(jSONObject, (WebView) m8358.get(0), t);
                    }
                });
                return;
            }
        }
        super.mo5823(jSONObject, null, t);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    void mo8652(T t) {
        z zVar;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        if (((a) this.f3224).f3238) {
            zVar = this.f3226.get(t);
        } else {
            zVar = this.f3225;
        }
        mo5822(jsonObjectInit, (JSONObject) zVar.m8731(), (WebView) t);
    }

    public class a {

        /* renamed from: ﮌ, reason: contains not printable characters */
        private boolean f3236;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3237;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3238;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3239;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3240;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3241;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private List<String> f3242;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3243;

        /* renamed from: ｋ, reason: contains not printable characters */
        protected List<String> f3244 = new ArrayList();

        /* renamed from: ﾇ, reason: contains not printable characters */
        private String f3245;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3246;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m8669(String str) {
            this.f3245 = str;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final x<T>.a m8673(List<String> list) {
            this.f3242 = list;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final x<T>.a m8672(boolean z) {
            this.f3246 = z;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m8671(boolean z) {
            this.f3243 = z;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final x<T>.a m8675(boolean z) {
            this.f3240 = z;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final x<T>.a m8668(boolean z) {
            this.f3237 = z;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final x<T>.a m8674(boolean z) {
            this.f3241 = z;
            return this;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        public final x<T>.a m8665(boolean z) {
            this.f3239 = z;
            return this;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final x<T>.a m8667(boolean z) {
            this.f3238 = z;
            return this;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final x<T>.a m8666(boolean z) {
            this.f3236 = z;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final x<T>.a m8670(List<String> list) {
            if (list != null) {
                this.f3244 = list;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public void m8648(T t, List<WebView> list) {
        z zVar;
        z zVar2;
        if (((a) this.f3224).f3238) {
            zVar = this.f3226.get(t);
        } else {
            zVar = this.f3225;
        }
        zVar.m8733(list);
        if (((a) this.f3224).f3246) {
            if (((a) this.f3224).f3238) {
                zVar2 = this.f3226.get(t);
            } else {
                zVar2 = this.f3225;
            }
            zVar2.m8737(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* renamed from: ﾒ */
    protected final String mo5818(T t) {
        z zVar;
        if (((a) this.f3224).f3238) {
            zVar = this.f3226.get(t);
        } else {
            zVar = this.f3225;
        }
        return zVar.mo5818((z) t);
    }
}
