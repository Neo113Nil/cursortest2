package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.i.x;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ac extends x<View> implements View.OnLayoutChangeListener, jv {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f87 = 333016517;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f88 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f89 = {Ascii.CR, -7, 8, -10, Ascii.CR, Ascii.EM, -28, 35, -54, Ascii.DC2, -4, 19, -33, 8, Ascii.VT, -10, 5, Ascii.DC2, -77, -2, -3, Ascii.FF, 70, -83, -1, 6, 9, -17, 17, 69, -79, -5, 84, -71, -7, 5, -5, 9, -15, 1, 10, -3, 76, -82, 3, -3, 0, 45, -26, -2, -7, Ascii.CR, -7, 37, -49, -1, 6, -10, Ascii.CAN, Ascii.NAK, -34, -1, 79, -78, 5, 73, -82, 3, -3, 0, 45, 0, 0, 0, 0};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f90 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f91 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f92 = 237598775;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f93 = 110;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Class f94;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private c f95;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f96;

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﻐ, reason: contains not printable characters */
    final /* bridge */ /* synthetic */ View mo5783(View view) {
        int i = 2 % 2;
        int i2 = f91 + 97;
        f90 = i2 % 128;
        View view2 = view;
        if (i2 % 2 == 0) {
            return m5776(view2);
        }
        m5776(view2);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ, reason: contains not printable characters */
    final /* bridge */ /* synthetic */ void mo5789(View view, List list) {
        int i = 2 % 2;
        int i2 = f91 + 29;
        f90 = i2 % 128;
        int i3 = i2 % 2;
        m5781(view, (List<WebView>) list);
        int i4 = f90 + 71;
        f91 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    ac(JSONObject jSONObject) {
        super(null);
        this.f96 = new WeakHashMap<>();
        this.f95 = new c(this);
        m5785(jSONObject);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m5785(JSONObject jSONObject) {
        int i = 2 % 2;
        c cVar = new c(this, jSONObject);
        m8651(cVar);
        this.f95 = cVar;
        try {
            this.f94 = Class.forName(c.m5792(cVar));
            int i2 = f90;
            int i3 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f91 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f91 = i5 % 128;
            int i6 = i5 % 2;
            m5778();
        } catch (ClassNotFoundException e) {
            m.m8520(m5779((short) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getOffsetBefore("", 0) - 333016430, View.MeasureSpec.getSize(0) - 91, (-237598775) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) KeyEvent.getDeadChar(0, 0)).intern(), new StringBuilder().append(m5779((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-333016448) - KeyEvent.getDeadChar(0, 0), Color.green(0) - 79, (-237598757) - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()).append(c.m5792(cVar)).append(m5779((short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-333016459) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 108, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 237598728, (byte) ((-1) - TextUtils.lastIndexOf("", '0'))).intern()).append(e.getLocalizedMessage()).toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5778() {
        int i = 2 % 2;
        int i2 = f90 + 47;
        f91 = i2 % 128;
        int i3 = i2 % 2;
        jp.m8258().m8266(this);
        int i4 = f90 + 75;
        f91 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5786() {
        int i = 2 % 2;
        int i2 = f91 + 43;
        f90 = i2 % 128;
        if (i2 % 2 == 0) {
            m8631((t) null);
            jp.m8258().m8265(this);
        } else {
            m8631((t) null);
            jp.m8258().m8265(this);
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    private static View m5776(View view) {
        int i = 2 % 2;
        int i2 = f90 + 103;
        int i3 = i2 % 128;
        f91 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        f90 = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾇ, reason: contains not printable characters */
    final t<WebView, View> mo5788() {
        int i = 2 % 2;
        int i2 = f90;
        int i3 = i2 + 115;
        f91 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = i2 + 87;
        f91 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.x
    /* renamed from: ﾒ, reason: contains not printable characters */
    final z mo5790() {
        int i = 2 % 2;
        aa aaVar = new aa();
        int i2 = f90 + 85;
        f91 = i2 % 128;
        if (i2 % 2 != 0) {
            return aaVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.ac.f90 + 3;
        com.ironsource.adqualitysdk.sdk.i.ac.f91 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        m5780(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(com.ironsource.adqualitysdk.sdk.i.ac.c.m5794(r3.f95)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        r4 = m5782(r4, com.ironsource.adqualitysdk.sdk.i.ac.c.m5794(r3.f95));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ac.f91 + 41;
        com.ironsource.adqualitysdk.sdk.i.ac.f90 = r1 % 128;
        r1 = r1 % 2;
        r4.addOnLayoutChangeListener(r3);
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5787(View view) {
        View m5777;
        int i = 2 % 2;
        int i2 = f91 + 19;
        f90 = i2 % 128;
        if (i2 % 2 != 0) {
            m5777 = m5777(view, this.f94);
            int i3 = 72 / 0;
        } else {
            m5777 = m5777(view, this.f94);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jv
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void mo5784(View view) {
        int i = 2 % 2;
        View m5777 = m5777(view, this.f94);
        if (m5777 != null) {
            int i2 = f91 + 55;
            f90 = i2 % 128;
            int i3 = i2 % 2;
            if (this.f96.remove(m5777) != null) {
                mo8652((ac) view);
                int i4 = f91 + 67;
                f90 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2 % 2;
        try {
            View m5777 = m5777(view, this.f94);
            if (m5777 != null) {
                int i10 = f91 + 25;
                f90 = i10 % 128;
                int i11 = i10 % 2;
                m5780(m5777);
                view.removeOnLayoutChangeListener(this);
            }
            int i12 = f90 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f91 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th) {
            kl.m8458(m5779((short) (Process.myPid() >> 22), (-333016430) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-92) - Process.getGidForName(""), (-237598775) - TextUtils.getTrimmedLength(""), (byte) Drawable.resolveOpacity(0, 0)).intern(), m5779((short) Color.red(0), KeyEvent.normalizeMetaState(0) - 333016448, (ViewConfiguration.getLongPressTimeout() >> 16) - 87, AndroidCharacter.getMirror('0') - 30774, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), th, false);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5780(View view) {
        int i = 2 % 2;
        int i2 = f90 + 37;
        f91 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f96.containsKey(view);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        if (!this.f96.containsKey(view)) {
            this.f96.put(view, Boolean.TRUE);
            mo8653((ac) view, Integer.toHexString(view.hashCode()));
            int i3 = f90 + 33;
            f91 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f90 + 1;
        f91 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private View m5777(View view, Class cls) {
        int i = 2 % 2;
        int i2 = f91 + 95;
        f90 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
            if (!(view instanceof ViewGroup)) {
                return null;
            }
        } else if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (cls.isAssignableFrom(childAt.getClass())) {
                return childAt;
            }
            View m5777 = m5777(childAt, cls);
            if (m5777 != null) {
                int i5 = f91 + 31;
                f90 = i5 % 128;
                int i6 = i5 % 2;
                return m5777;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private View m5782(View view, String str) {
        int i = 2 % 2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            while (i2 < viewGroup.getChildCount()) {
                int i3 = f90 + 55;
                f91 = i3 % 128;
                int i4 = i3 % 2;
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getClass().getName().startsWith(str)) {
                    return childAt;
                }
                View m5782 = m5782(childAt, str);
                if (m5782 != null) {
                    int i5 = f91 + 23;
                    f90 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return m5782;
                    }
                    throw null;
                }
                i2++;
                int i6 = f90 + 7;
                f91 = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return null;
    }

    /* renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m5781(View view, List<WebView> list) {
        int i = 2 % 2;
        int i2 = f90 + 51;
        f91 = i2 % 128;
        if (i2 % 2 == 0) {
            kq.m8508(view, WebView.class, c.m5797(this.f95), false, false, null, this.f95.f3244, list);
        } else {
            kq.m8508(view, WebView.class, c.m5797(this.f95), true, false, null, this.f95.f3244, list);
        }
        int i3 = f91 + 25;
        f90 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public class c extends x.a {

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static int f97 = 0;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private static int f98 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static char f99 = 51382;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f100 = 46248;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f101 = 8194;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char[] f102 = {18218, 62835, 9141, 20985, 36359, 15470, 27289, 39109, 54559, 868, 45441, 60979, 7281, 47276, 2811, 56354, 44651, 29098, 50166, 38190, 26463, 10889, 64733, 20016, 4524, 58353, 46388, 1889, 51902, 'j', 45621, 25816, 5821, 51537, 31536, 11726, 57231, 37459, 17410, AbstractJsonLexerKt.UNICODE_ESC, 45621, 25833, 5783, 51552, 31530, 11734, 57227, 37498, 17413, AbstractJsonLexerKt.UNICODE_ESC, 45621, 25833, 5784, 51577, 31528, 11717, 57241, 37459, 17412, 63189, 43378, 23356, 'i', 45611, 25852, 5789, 51574, 31502, 11723, 57241, 37444, 'v', 45615, 25833, 5797, 51563, 31498, 11723, 57251, 37463, 17432, 63187, 43376, 23341};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static long f103 = 60374997389980230L;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static char f104 = 26653;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f105;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private String f106;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f107;

        /* renamed from: ﻐ, reason: contains not printable characters */
        static /* synthetic */ String m5792(c cVar) {
            int i = 2 % 2;
            int i2 = f97 + 1;
            int i3 = i2 % 128;
            f98 = i3;
            int i4 = i2 % 2;
            String str = cVar.f105;
            int i5 = i3 + 63;
            f97 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        static /* synthetic */ String m5794(c cVar) {
            int i = 2 % 2;
            int i2 = f97 + 11;
            f98 = i2 % 128;
            int i3 = i2 % 2;
            String str = cVar.f106;
            if (i3 != 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        static /* synthetic */ String m5797(c cVar) {
            int i = 2 % 2;
            int i2 = f98;
            int i3 = i2 + 61;
            f97 = i3 % 128;
            int i4 = i3 % 2;
            String str = cVar.f107;
            if (i4 != 0) {
                Object obj = null;
                super.hashCode();
                throw null;
            }
            int i5 = i2 + 77;
            f97 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 16 / 0;
            }
            return str;
        }

        public c(ac acVar) {
        }

        public c(ac acVar, JSONObject jSONObject) {
            m5791(jSONObject.optString(m5795("\u2fe8ᔀ䦫狉\u0b00꫱ﺭ現묗츆艂\udba7\uda09\uaa38獊\ua633\ue838䘨걮딱高竦", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21).intern()));
            m5798(jSONObject.optString(m5793((char) (18269 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0), View.resolveSize(0, 0) + 13).intern()));
            m5796(jSONObject.optString(m5793((char) ((ViewConfiguration.getTapTimeout() >> 16) + 47324), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SO, 15 - ExpandableListView.getPackedPositionChild(0L)).intern()));
            m8669(jSONObject.optString(m5793((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 29 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 10).intern()));
            m8672(false);
            m8668(!TextUtils.isEmpty(jSONObject.optString(m5793((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + (-1)), 30 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) || jSONObject.optBoolean(m5795("쿱ᇍ堓\ue698\uedceᆞ퓒騔ᛠ\ue20c䯱뇣\u0b00꫱⨙컵", TextUtils.lastIndexOf("", '0', 0) + 17).intern()) || jSONObject.optBoolean(m5795("쿱ᇍ堓\ue698\uedceᆞ\uf486\ud984䛠ྌ獊\ua633䯱뇣\u0b00꫱⨙컵", 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()));
            m8674(jSONObject.optBoolean(m5795("쿱ᇍ堓\ue698\uedceᆞ퓒騔ᛠ\ue20c䯱뇣\u0b00꫱⨙컵", 16 - KeyEvent.keyCodeFromString("")).intern()));
            m8665(jSONObject.optBoolean(m5793((char) TextUtils.getTrimmedLength(""), 39 - Drawable.resolveOpacity(0, 0), (-16777206) - Color.rgb(0, 0, 0)).intern()));
            m8673(TextUtils.isEmpty(jSONObject.optString(m5795("\ue87e\uea25焧ဋミ圈ԉ掗❳㐆", 9 - Color.blue(0)).intern())) ? null : Arrays.asList(jSONObject.optString(m5795("\ue87e\uea25焧ဋミ圈ԉ掗❳㐆", 9 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()).split(m5795("\udf0a딏", (Process.myTid() >> 22) + 1).intern())));
            m8671(jSONObject.optBoolean(m5793((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 49, 13 - View.resolveSize(0, 0)).intern(), true));
            m8675(false);
            m8667(jSONObject.optBoolean(m5795("﨎⮵撬\udffa蟝㞴á\ue768\udf44쬎\udc2e㯒簷指ﻊ枿녞豙", 16 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()));
            m8666(jSONObject.optBoolean(m5793((char) View.combineMeasuredStates(0, 0), (Process.myTid() >> 22) + 62, ExpandableListView.getPackedPositionChild(0L) + 10).intern()));
            m8670(kj.m8411(jSONObject.optJSONArray(m5793((char) View.MeasureSpec.makeMeasureSpec(0, 0), 70 - TextUtils.lastIndexOf("", '0', 0), 12 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())));
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private c m5791(String str) {
            int i = 2 % 2;
            int i2 = f98;
            int i3 = i2 + 17;
            f97 = i3 % 128;
            int i4 = i3 % 2;
            this.f107 = str;
            int i5 = i2 + 13;
            f97 = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private c m5798(String str) {
            int i = 2 % 2;
            int i2 = f98;
            int i3 = i2 + 3;
            f97 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                this.f105 = str;
                int i4 = i2 + 1;
                f97 = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f105 = str;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private c m5796(String str) {
            int i = 2 % 2;
            int i2 = f97;
            int i3 = i2 + 35;
            f98 = i3 % 128;
            int i4 = i3 % 2;
            this.f106 = str;
            int i5 = i2 + 93;
            f98 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m5795(String str, int i) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (o.f3094) {
                char[] cArr3 = new char[cArr2.length];
                o.f3095 = 0;
                char[] cArr4 = new char[2];
                while (o.f3095 < cArr2.length) {
                    cArr4[0] = cArr2[o.f3095];
                    cArr4[1] = cArr2[o.f3095 + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr4[1];
                        char c2 = cArr4[0];
                        char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f101)) ^ ((c2 >>> 5) + f99)));
                        cArr4[1] = c3;
                        cArr4[0] = (char) (c2 - (((c3 >>> 5) + f100) ^ ((c3 + i2) ^ ((c3 << 4) + f104))));
                        i2 -= 40503;
                    }
                    cArr3[o.f3095] = cArr4[0];
                    cArr3[o.f3095 + 1] = cArr4[1];
                    o.f3095 += 2;
                }
                str2 = new String(cArr3, 0, i);
            }
            return str2;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m5793(char c, int i, int i2) {
            String str;
            synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1197) {
                char[] cArr = new char[i2];
                com.ironsource.adqualitysdk.sdk.i.c.f1198 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.c.f1198 < i2) {
                    cArr[com.ironsource.adqualitysdk.sdk.i.c.f1198] = (char) ((f102[com.ironsource.adqualitysdk.sdk.i.c.f1198 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1198 * f103)) ^ c);
                    com.ironsource.adqualitysdk.sdk.i.c.f1198++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m5779(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f93;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f89;
                if (bArr != null) {
                    i5 = (byte) (bArr[f92 + i3] + i4);
                } else {
                    i5 = (short) (f88[f92 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f92 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f87);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f89;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f88;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
