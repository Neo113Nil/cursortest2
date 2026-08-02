package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.exoplayer2.C;
import com.ironsource.adqualitysdk.sdk.i.hm;
import com.ironsource.adqualitysdk.sdk.i.hn;
import com.ironsource.adqualitysdk.sdk.i.ho;
import com.ironsource.adqualitysdk.sdk.i.hp;
import com.ironsource.adqualitysdk.sdk.i.hq;
import com.ironsource.adqualitysdk.sdk.i.ht;
import com.ironsource.adqualitysdk.sdk.i.km;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes2.dex */
public final class cz extends cw {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1530 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f1531 = true;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1532 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1533 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f1534 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f1535 = 63;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1536 = -1420473262;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1537 = {132, Typography.plusMinus, Typography.registered, '_', Typography.cent, 164, Typography.nbsp, 179, 168, 173, 166, 140, Typography.pound, 143, 171, 184, 142, 146, 170, 130, 172, 175, 139, 178, 128, Typography.section};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f1538;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ List m7388(List list, Object[] objArr) {
        int i = 2 % 2;
        int i2 = f1530 + 7;
        f1532 = i2 % 128;
        int i3 = i2 % 2;
        List<Object> m7383 = m7383((List<Object>) list, objArr);
        int i4 = f1530 + 75;
        f1532 = i4 % 128;
        int i5 = i4 % 2;
        return m7383;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final iw m7405(final cl clVar, List<Object> list, final ee eeVar) {
        int i = 2 % 2;
        final dz dzVar = (dz) m7365(list, 0, dz.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i2 = f1530 + 35;
            f1532 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll((Collection) m7365(list, 1, List.class));
        }
        Object obj = null;
        if (dzVar == null) {
            return null;
        }
        iw iwVar = new iw() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iw
            /* renamed from: ｋ, reason: contains not printable characters */
            public final void mo7412() {
                arrayList.add(0, this);
                dzVar.m7671(eeVar, clVar, arrayList);
                arrayList.remove(0);
            }
        };
        int i4 = f1530 + 51;
        f1532 = i4 % 128;
        if (i4 % 2 != 0) {
            return iwVar;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Object m7381(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f1530 = i2 % 128;
        jo.m8248().m8255((iw) m7365(list, i2 % 2 != 0 ? 1 : 0, iw.class));
        int i3 = f1532 + 111;
        f1530 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m7386(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + 71;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        jo.m8248().m8256((iw) m7365(list, 0, iw.class));
        int i4 = f1532 + 9;
        f1530 = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m7402(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            hp.b bVar = new hp.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.6
                @Override // com.ironsource.adqualitysdk.sdk.i.hp.b
                /* renamed from: ﾒ */
                public final void mo7409(hp hpVar, View view) {
                    dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, hpVar, view}));
                }
            };
            int i2 = f1530 + 9;
            f1532 = i2 % 128;
            int i3 = i2 % 2;
            return bVar;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", "誇荵벡烫", "\ufaddĆ߂ꕓ㽤\ue372侣逅퇟쓣ਪ㕶떨轀Π겭뵲䅘㲙䰐ᬌ\ue017젏ၔ\uf08a埍멆ྉ詐\uf023뫌ퟀઇ浺", Process.getGidForName("") + 1).intern(), e);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m7400(List<Object> list) {
        int i = 2 % 2;
        View view = (View) m7365(list, 0, View.class);
        final hp.b bVar = (hp.b) m7365(list, 1, hp.b.class);
        if (!m7382(list, 2)) {
            ki.m8399(view, new hp.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.12
                @Override // com.ironsource.adqualitysdk.sdk.i.hp.b
                /* renamed from: ﾒ, reason: contains not printable characters */
                public final void mo7409(final hp hpVar, final View view2) {
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.12.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            hp.b.this.mo7409(hpVar, view2);
                        }
                    });
                }
            });
            return null;
        }
        int i2 = f1532 + 5;
        f1530 = i2 % 128;
        if (i2 % 2 != 0) {
            ki.m8399(view, bVar);
            int i3 = 48 / 0;
        } else {
            ki.m8399(view, bVar);
        }
        int i4 = f1530 + 1;
        f1532 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnClickListener m7384(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 19;
        f1532 = i2 % 128;
        int i3 = i2 % 2;
        View.OnClickListener m8403 = ki.m8403((View) m7365(list, 0, View.class));
        int i4 = f1532 + 11;
        f1530 = i4 % 128;
        int i5 = i4 % 2;
        return m8403;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Object m7403(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            ht.e eVar = new ht.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.15
                @Override // com.ironsource.adqualitysdk.sdk.i.ht.e
                /* renamed from: ﻛ */
                public final boolean mo7411(ht htVar, View view, MotionEvent motionEvent) {
                    return dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, htVar, view, motionEvent})).m7682();
                }
            };
            int i2 = f1530 + 29;
            f1532 = i2 % 128;
            int i3 = i2 % 2;
            return eVar;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u0000\u0000\u0000\u0000", "䍿印㭐䉈", "㻳닾\ue58e빇饝♧큆상㧝\ue547㭿쵼칺\ueb24餷䛷㺛젾樓౮놣\ue94eޟ鰆暐銆\udfe4⮣ᩂ㑲⬌妗ꍕ賈", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern(), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005b, code lost:
    
        if ((r6 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        r6 = 3 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (m7382(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (m7382(r6, 4) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m8400(r1, r2);
        r6 = com.ironsource.adqualitysdk.sdk.i.cz.f1530 + 1;
        com.ironsource.adqualitysdk.sdk.i.cz.f1532 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m8400(r1, new com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass14());
        r6 = com.ironsource.adqualitysdk.sdk.i.cz.f1532 + 89;
        com.ironsource.adqualitysdk.sdk.i.cz.f1530 = r6 % 128;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7404(List<Object> list) {
        View view;
        final ht.e eVar;
        int i = 2 % 2;
        int i2 = f1530 + 115;
        f1532 = i2 % 128;
        if (i2 % 2 == 0) {
            view = (View) m7365(list, 1, View.class);
            eVar = (ht.e) m7365(list, 0, ht.e.class);
        } else {
            view = (View) m7365(list, 0, View.class);
            eVar = (ht.e) m7365(list, 1, ht.e.class);
        }
        int i3 = f1532 + 39;
        f1530 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static View.OnTouchListener m7380(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + 3;
        f1530 = i2 % 128;
        View.OnTouchListener m8393 = ki.m8393((View) m7365(list, i2 % 2 != 0 ? 1 : 0, View.class));
        int i3 = f1532 + 87;
        f1530 = i3 % 128;
        if (i3 % 2 == 0) {
            return m8393;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final Object m7398(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        Object obj = null;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            ho.c cVar = new ho.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.11
                @Override // com.ironsource.adqualitysdk.sdk.i.ho.c
                /* renamed from: ﾇ, reason: contains not printable characters */
                public final void mo7408(ho hoVar, MediaPlayer mediaPlayer) {
                    dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, hoVar, mediaPlayer}));
                }
            };
            int i2 = f1532 + 107;
            f1530 = i2 % 128;
            if (i2 % 2 == 0) {
                return cVar;
            }
            super.hashCode();
            throw null;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 32294), "\u0000\u0000\u0000\u0000", "춒뙸┈䉾", "\uf3ed铺粅瀠栌㮔\u00ad嗠ꋆ\u0de5ഐ㹌᷑靹㊷蔵鷿榀쮎\ue2c6喴\ue71f\uf261ܡ豢珶黬\ue253膊婣ꥱ\ue779씮嵇ⓔ⍶㐀\u3040즛뙞\ue99eⱚ菷\uf655", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
            return null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Object m7399(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            hm.e eVar = new hm.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.13
                @Override // com.ironsource.adqualitysdk.sdk.i.hm.e
                /* renamed from: ﻛ, reason: contains not printable characters */
                public final boolean mo7410(hm hmVar, MediaPlayer mediaPlayer, int i2, int i3) {
                    return dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, hmVar, mediaPlayer, Integer.valueOf(i2), Integer.valueOf(i3)})).m7682();
                }
            };
            int i2 = f1532 + 107;
            f1530 = i2 % 128;
            if (i2 % 2 == 0) {
                return eVar;
            }
            throw null;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 55793), "\u0000\u0000\u0000\u0000", "纣ୡ\uf189ϙ", "\ue993ʇ卼䢵輛ภ\u0ac6莹捬撔ヸ㝰䝮뺫\uf140䇦ῦ㱡ृ\ue549舓\uf728㻮蘗殀ﴮົ䝒撻粒溩ੳ퀛껞찋⨗辒즐抎Ꝏ", Process.myTid() >> 22).intern(), e);
            return null;
        }
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final Object m7389(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        Object obj = null;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            hn.a aVar = new hn.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.16
                @Override // com.ironsource.adqualitysdk.sdk.i.hn.a
                /* renamed from: ﾇ */
                public final void mo7407(hn hnVar, MediaPlayer mediaPlayer) {
                    dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, hnVar, mediaPlayer}));
                }
            };
            int i2 = f1532 + 9;
            f1530 = i2 % 128;
            if (i2 % 2 == 0) {
                return aVar;
            }
            super.hashCode();
            throw null;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "שׁᭌ诌㑰", "⌧黕㥷쇾띢䭫찰\ue901⭘焕\ud9af\uf3e7㎷薽䤪洱⯡笞똊ꊆ⩋ἒ㽨禜⸭⣂\u0a84ു픛䙪䒚자\uece2汉丅ꖝ녧⪶깬係\uecc3北ꊽᤇ㤶籔", ViewConfiguration.getTapTimeout() >> 16).intern(), e);
            return null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Object m7393(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            hq.d dVar = new hq.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.17
                @Override // com.ironsource.adqualitysdk.sdk.i.hq.d
                /* renamed from: ﻛ */
                public final void mo7406(hq hqVar, MediaPlayer mediaPlayer) {
                    dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, hqVar, mediaPlayer}));
                }
            };
            int i2 = f1530 + 23;
            f1532 = i2 % 128;
            int i3 = i2 % 2;
            return dVar;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7387(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0082\u0086\u008a\u0086\u0088\u0098\u0089\u0097\u0086\u0088\u0086\u008f\u0096\u0095\u0083\u0094\u0093\u0086\u0086\u0092\u008a\u0091\u0082\u0086\u0090\u0087\u008f\u008e\u0087\u0089\u008d\u0086\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
            return null;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Object m7395(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        final boolean m7382;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            m7382 = m7382(list, 2);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static int f1602 = 1;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static long f1603 = 5936074866090961880L;

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static int f1604;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10 = 2 % 2;
                    int i11 = f1602 + 75;
                    f1604 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        final List<Object> m7388 = cz.m7388(list2, new Object[]{this, view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
                        if (!m7382) {
                            p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* renamed from: ｋ */
                                public final void mo5828() {
                                    dzVar.m7671(eeVar, clVar2, m7388);
                                }
                            });
                            return;
                        }
                        int i13 = f1602 + 19;
                        f1604 = i13 % 128;
                        if (i13 % 2 == 0) {
                            dzVar.m7671(eeVar, clVar2, m7388);
                        } else {
                            dzVar.m7671(eeVar, clVar2, m7388);
                            int i14 = 11 / 0;
                        }
                    } catch (Throwable th) {
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7415("\ueb9dぁ屼硶萆ꁯ찳\ue8db㒠僔粘颍꒽셎\ued6d२唜焀鴶마엪\ue1f8ඏ⦉疹鉘빲\uda74\ue602Ȣ⸠䪍雑닽\ude9d敖ڰ⍊会", 56299 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern()).append(dzVar.m7672()).toString(), th);
                    }
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private static String m7415(String str, int i2) {
                    String str2;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (i.f2454) {
                        i.f2455 = i2;
                        char[] cArr3 = new char[cArr2.length];
                        i.f2453 = 0;
                        while (i.f2453 < cArr2.length) {
                            cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f1603);
                            i.f2453++;
                        }
                        str2 = new String(cArr3);
                    }
                    return str2;
                }
            };
            int i2 = f1532 + 71;
            f1530 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 36 / 0;
            }
            return onLayoutChangeListener;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) View.MeasureSpec.getSize(0), "\u0000\u0000\u0000\u0000", "䃖\uf24cￎ쩀", "軅윸\ue5f7脋홗䙢\udb69몉㡮䕎鼎y楄⦄ঘ暭끸쇹부ុ椴ඁ\ude48荷〪踨䩙ߟጚ쵹Ａ埊\uec44쇭ᚘᩯ\uec0d", (Process.myPid() >> 22) - 822981568).intern(), e);
            return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Object m7391(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final dz dzVar2;
        final List<Object> list2;
        final boolean m7382;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            dzVar2 = (dz) m7365(list, 1, dz.class);
            list2 = m7364(list, 2);
            m7382 = m7382(list, 3);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.4

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static int f1589 = 0;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static int f1590 = 1;

                /* renamed from: ﺙ, reason: contains not printable characters */
                private static long f1591 = 5720843451004891501L;

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    int i2 = 2 % 2;
                    int i3 = f1590 + 55;
                    f1589 = i3 % 128;
                    if (i3 % 2 != 0) {
                        m7414(dzVar, view);
                        int i4 = 93 / 0;
                    } else {
                        m7414(dzVar, view);
                    }
                    int i5 = f1589 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                    f1590 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 26 / 0;
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    int i2 = 2 % 2;
                    int i3 = f1590 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f1589 = i3 % 128;
                    int i4 = i3 % 2;
                    m7414(dzVar2, view);
                    int i5 = f1589 + 69;
                    f1590 = i5 % 128;
                    int i6 = i5 % 2;
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private void m7414(final dz dzVar3, View view) {
                    int i2 = 2 % 2;
                    int i3 = f1590 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f1589 = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        final List<Object> m7388 = cz.m7388(list2, new Object[]{this, view});
                        if (m7382) {
                            dzVar3.m7671(eeVar, clVar2, m7388);
                            int i5 = f1589 + 71;
                            f1590 = i5 % 128;
                            if (i5 % 2 == 0) {
                                throw null;
                            }
                            return;
                        }
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.4.3
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                dzVar3.m7671(eeVar, clVar2, m7388);
                            }
                        });
                        int i6 = f1590 + 35;
                        f1589 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7413("☱♴䠘铪礇쯭\uf642必\ue3f7뼙밍鉸굹\uf482竆퐃睙쫥❽⻭らv\ued34悛贈䖌꯷뭎葨鯓醟ﷷ䆑턨幟㞪௴\u177bӵ\u0a78핅沰슪䰅齐ꈉ轭蚂", Color.rgb(0, 0, 0) + 16777217).intern()).append(dzVar3.m7672()).toString(), th);
                    }
                }

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static String m7413(String str, int i2) {
                    String str2;
                    char[] cArr = str;
                    if (str != null) {
                        cArr = str.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    synchronized (g.f2155) {
                        char[] m7785 = g.m7785(f1591, cArr2, i2);
                        g.f2157 = 4;
                        while (g.f2157 < m7785.length) {
                            g.f2156 = g.f2157 - 4;
                            m7785[g.f2157] = (char) ((m7785[g.f2157] ^ m7785[g.f2157 % 4]) ^ (g.f2156 * f1591));
                            g.f2157++;
                        }
                        str2 = new String(m7785, 4, m7785.length - 4);
                    }
                    return str2;
                }
            };
            int i2 = f1532 + 61;
            f1530 = i2 % 128;
            int i3 = i2 % 2;
            return onAttachStateChangeListener;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7387(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u0082\u0086\u008a\u0086\u0088\u0098\u0089\u0097\u0086\u008b\u008a\u0087\u009a\u0094\u0086\u0088\u0087\u0088\u0092\u009a\u0085\u0087\u0088\u0088\u0099\u008a\u0091\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0082\u0083\u0082\u0082\u0081").intern(), e);
            return null;
        }
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Object m7394(List<Object> list) {
        int i = 2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m7365(list, 0, MediaPlayer.class);
        final hq.d dVar = (hq.d) m7365(list, 1, hq.d.class);
        if (!m7382(list, 2)) {
            ki.m8401(mediaPlayer, new hq.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.1
                @Override // com.ironsource.adqualitysdk.sdk.i.hq.d
                /* renamed from: ﻛ, reason: contains not printable characters */
                public final void mo7406(final hq hqVar, final MediaPlayer mediaPlayer2) {
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            hq.d.this.mo7406(hqVar, mediaPlayer2);
                        }
                    });
                }
            });
            int i2 = f1530 + 15;
            f1532 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f1532 + 35;
        f1530 = i4 % 128;
        if (i4 % 2 == 0) {
            ki.m8401(mediaPlayer, dVar);
            return null;
        }
        ki.m8401(mediaPlayer, dVar);
        int i5 = 15 / 0;
        return null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final Object m7390(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + 17;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m7365(list, 0, MediaPlayer.class);
        final ho.c cVar = (ho.c) m7365(list, 1, ho.c.class);
        if (!m7382(list, 2)) {
            ki.m8396(mediaPlayer, new ho.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.2
                @Override // com.ironsource.adqualitysdk.sdk.i.ho.c
                /* renamed from: ﾇ */
                public final void mo7408(final ho hoVar, final MediaPlayer mediaPlayer2) {
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.2.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            ho.c.this.mo7408(hoVar, mediaPlayer2);
                        }
                    });
                }
            });
        } else {
            int i4 = f1532 + 109;
            f1530 = i4 % 128;
            if (i4 % 2 != 0) {
                ki.m8396(mediaPlayer, cVar);
                int i5 = 27 / 0;
            } else {
                ki.m8396(mediaPlayer, cVar);
            }
        }
        int i6 = f1530 + 85;
        f1532 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Object m7397(List<Object> list) {
        int i = 2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m7365(list, 0, MediaPlayer.class);
        final hm.e eVar = (hm.e) m7365(list, 1, hm.e.class);
        if (!m7382(list, 2)) {
            ki.m8407(mediaPlayer, new hm.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.7
                @Override // com.ironsource.adqualitysdk.sdk.i.hm.e
                /* renamed from: ﻛ */
                public final boolean mo7410(final hm hmVar, final MediaPlayer mediaPlayer2, final int i2, final int i3) {
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            hm.e.this.mo7410(hmVar, mediaPlayer2, i2, i3);
                        }
                    });
                    return false;
                }
            });
        } else {
            int i2 = f1532 + 73;
            f1530 = i2 % 128;
            int i3 = i2 % 2;
            ki.m8407(mediaPlayer, eVar);
        }
        int i4 = f1530 + 67;
        f1532 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Object m7392(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 59;
        f1532 = i2 % 128;
        int i3 = i2 % 2;
        MediaPlayer mediaPlayer = (MediaPlayer) m7365(list, 0, MediaPlayer.class);
        final hn.a aVar = (hn.a) m7365(list, 1, hn.a.class);
        if (m7382(list, 2)) {
            ki.m8395(mediaPlayer, aVar);
        } else {
            ki.m8395(mediaPlayer, new hn.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.10
                @Override // com.ironsource.adqualitysdk.sdk.i.hn.a
                /* renamed from: ﾇ, reason: contains not printable characters */
                public final void mo7407(final hn hnVar, final MediaPlayer mediaPlayer2) {
                    p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.10.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* renamed from: ｋ */
                        public final void mo5828() {
                            hn.a.this.mo7407(hnVar, mediaPlayer2);
                        }
                    });
                }
            });
        }
        int i4 = f1530 + 13;
        f1532 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static Object m7379(List<Object> list) {
        Object mo6363;
        int i = 2 % 2;
        int i2 = f1532 + 99;
        f1530 = i2 % 128;
        int i3 = i2 % 2;
        hj hjVar = (hj) m7365(list, 0, hj.class);
        if (hjVar == null) {
            return null;
        }
        int i4 = f1532 + 85;
        f1530 = i4 % 128;
        if (i4 % 2 != 0) {
            mo6363 = hjVar.mo6363();
            int i5 = 39 / 0;
        } else {
            mo6363 = hjVar.mo6363();
        }
        int i6 = f1530 + 55;
        f1532 = i6 % 128;
        int i7 = i6 % 2;
        return mo6363;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final Object m7396(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        final dz dzVar;
        final List<Object> list2;
        final boolean m7382;
        int i = 2 % 2;
        try {
            dzVar = (dz) m7365(list, 0, dz.class);
            list2 = m7364(list, 1);
            m7382 = m7382(list, 2);
            clVar2 = clVar;
        } catch (Exception e) {
            e = e;
            clVar2 = clVar;
        }
        try {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9
                @Override // android.content.BroadcastReceiver
                public final void onReceive(final Context context, final Intent intent) {
                    if (!m7382) {
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                AnonymousClass9.m7418(anonymousClass9, dzVar, eeVar, clVar2, list2, context, intent);
                            }
                        });
                    } else {
                        dzVar.m7671(eeVar, clVar2, cz.m7388(list2, new Object[]{this, context, intent}));
                    }
                }

                /* renamed from: ﻐ, reason: contains not printable characters */
                static /* synthetic */ void m7418(AnonymousClass9 anonymousClass9, dz dzVar2, ee eeVar2, cl clVar3, List list3, Context context, Intent intent) {
                    dzVar2.m7671(eeVar2, clVar3, cz.m7388(list3, new Object[]{anonymousClass9, context, intent}));
                }
            };
            int i2 = f1532 + 33;
            f1530 = i2 % 128;
            int i3 = i2 % 2;
            return broadcastReceiver;
        } catch (Exception e2) {
            e = e2;
            cn.m7268(clVar2.m7203(), m7385((char) (14739 - View.combineMeasuredStates(0, 0)), "\u0000\u0000\u0000\u0000", "諯叒錨愹", "ݴ락ꥢ娛拫鵁礐ꨋ宽ᵃ⫒셩ﾍ潋饃뢙▉\uecaeԸ〛ꆸ\ud922腿舘ꜗ賶웹㵐\ud9b0펳뺍雫", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern(), e);
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Object m7401(final cl clVar, List<Object> list) {
        final String simpleName;
        int i = 2 % 2;
        final boolean z = false;
        Class cls = (Class) m7365(list, 0, Class.class);
        Object obj = m7365(list, 1, (Class<Object>) Object.class);
        if (list.size() > 2) {
            int i2 = f1530 + 93;
            f1532 = i2 % 128;
            z = i2 % 2 == 0 ? ((Boolean) m7365(list, 5, Boolean.class)).booleanValue() : ((Boolean) m7365(list, 2, Boolean.class)).booleanValue();
        }
        if (list.size() > 3) {
            int i3 = f1532 + 61;
            f1530 = i3 % 128;
            simpleName = i3 % 2 != 0 ? (String) m7365(list, 5, String.class) : (String) m7365(list, 3, String.class);
        } else {
            simpleName = cls.getSimpleName();
        }
        Object m8460 = km.m8460(cls, obj, new km.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.8

            /* renamed from: ﮐ, reason: contains not printable characters */
            private static int f1624 = 1;

            /* renamed from: ﱟ, reason: contains not printable characters */
            private static int f1625 = 0;

            /* renamed from: ﱡ, reason: contains not printable characters */
            private static char f1626 = 5;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1627 = {'.', 'E', 'r', 'o', ' ', 'i', 'n', 'v', 'k', 'g', GMTDateParser.MINUTES, 'e', 't', GMTDateParser.HOURS, GMTDateParser.DAY_OF_MONTH, 'l', GMTDateParser.SECONDS, FileSystemKt.UnixPathSeparator, '0', '1', '2', '3', '4', '5', '6'};

            @Override // com.ironsource.adqualitysdk.sdk.i.km.c
            /* renamed from: ﾒ, reason: contains not printable characters */
            public final void mo7417(Object obj2, Method method, Object[] objArr) {
                List arrayList;
                int i4 = 2 % 2;
                if (method != null) {
                    try {
                        String obj3 = new StringBuilder().append(simpleName).append(m7416((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, "/", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 1)).intern()).append(method.getName()).toString();
                        hj hjVar = (hj) obj2;
                        if (objArr != null) {
                            int i5 = f1625 + 87;
                            f1624 = i5 % 128;
                            if (i5 % 2 == 0) {
                                Arrays.asList(objArr);
                                Object obj4 = null;
                                super.hashCode();
                                throw null;
                            }
                            arrayList = Arrays.asList(objArr);
                        } else {
                            arrayList = new ArrayList();
                        }
                        List<Object> m7388 = cz.m7388(arrayList, new Object[]{hjVar});
                        ArrayList arrayList2 = new ArrayList();
                        if (z) {
                            arrayList2.add(m7388);
                            int i6 = f1624 + 83;
                            f1625 = i6 % 128;
                            int i7 = i6 % 2;
                            m7388 = arrayList2;
                        }
                        clVar.m7205().mo7155(obj3, m7388);
                    } catch (Exception e) {
                        cn.m7268(clVar.m7203(), new StringBuilder().append(m7416(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0002\u0003\u0003\u0004\u0003\u0000\u0006\u0007\b\u0002\t\u0006\u0007\u00059", (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 25)).intern()).append(method.getName()).append(m7416(11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0000\u000e\f\r\u0012\b\u0013\t\u0001\b\u0081", (byte) (View.MeasureSpec.getSize(0) + 97)).intern()).append(simpleName).append(m7416((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9, "\u0000\u0013\u0006\u000f\r\f\u000b\u0010\u0089", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 23)).intern()).toString(), e);
                        return;
                    }
                }
                int i8 = f1624 + 83;
                f1625 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 63 / 0;
                }
            }

            /* renamed from: ｋ, reason: contains not printable characters */
            private static String m7416(int i4, String str, byte b) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (j.f2674) {
                    char[] cArr3 = f1627;
                    char c = f1626;
                    char[] cArr4 = new char[i4];
                    if (i4 % 2 != 0) {
                        i4--;
                        cArr4[i4] = (char) (cArr2[i4] - b);
                    }
                    if (i4 > 1) {
                        j.f2681 = 0;
                        while (j.f2681 < i4) {
                            j.f2680 = cArr2[j.f2681];
                            j.f2677 = cArr2[j.f2681 + 1];
                            if (j.f2680 == j.f2677) {
                                cArr4[j.f2681] = (char) (j.f2680 - b);
                                cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                            } else {
                                j.f2679 = j.f2680 / c;
                                j.f2676 = j.f2680 % c;
                                j.f2678 = j.f2677 / c;
                                j.f2675 = j.f2677 % c;
                                if (j.f2676 == j.f2675) {
                                    j.f2679 = ((j.f2679 + c) - 1) % c;
                                    j.f2678 = ((j.f2678 + c) - 1) % c;
                                    int i5 = (j.f2679 * c) + j.f2676;
                                    int i6 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i5];
                                    cArr4[j.f2681 + 1] = cArr3[i6];
                                } else if (j.f2679 == j.f2678) {
                                    j.f2676 = ((j.f2676 + c) - 1) % c;
                                    j.f2675 = ((j.f2675 + c) - 1) % c;
                                    int i7 = (j.f2679 * c) + j.f2676;
                                    int i8 = (j.f2678 * c) + j.f2675;
                                    cArr4[j.f2681] = cArr3[i7];
                                    cArr4[j.f2681 + 1] = cArr3[i8];
                                } else {
                                    int i9 = (j.f2679 * c) + j.f2675;
                                    int i10 = (j.f2678 * c) + j.f2676;
                                    cArr4[j.f2681] = cArr3[i9];
                                    cArr4[j.f2681 + 1] = cArr3[i10];
                                }
                            }
                            j.f2681 += 2;
                        }
                    }
                    str2 = new String(cArr4);
                }
                return str2;
            }
        });
        int i4 = f1532 + 69;
        f1530 = i4 % 128;
        int i5 = i4 % 2;
        return m8460;
    }

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static boolean m7375(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 85;
        f1532 = i2 % 128;
        int i3 = i2 % 2;
        boolean m8462 = km.m8462(m7365(list, 0, Object.class));
        int i4 = f1530 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1532 = i4 % 128;
        int i5 = i4 % 2;
        return m8462;
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static kd m7376(List<Object> list) {
        WebView webView;
        String m7385;
        int i = 2 % 2;
        int i2 = f1530 + 73;
        f1532 = i2 % 128;
        if (i2 % 2 == 0) {
            webView = (WebView) m7365(list, 0, WebView.class);
            m7385 = m7385((char) (1 / (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "羨\uda20틄ԛ", "㵙餇㊝㋯ﰦ\uf67d⢅级睻", (-992337793) / Color.blue(0));
        } else {
            webView = (WebView) m7365(list, 0, WebView.class);
            m7385 = m7385((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", "羨\uda20틄ԛ", "㵙餇㊝㋯ﰦ\uf67d⢅级睻", Color.blue(0) - 992337793);
        }
        return kd.m8344(webView, m7385.intern());
    }

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static Object m7378(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + 7;
        f1530 = i2 % 128;
        ((kd) m7365(list, i2 % 2 != 0 ? 1 : 0, kd.class)).m8347();
        return null;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static Object m7377(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + 43;
        f1530 = i2 % 128;
        ((kd) m7365(list, i2 % 2 != 0 ? 1 : 0, kd.class)).m8351();
        int i3 = f1530 + 25;
        f1532 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* renamed from: ﬤ, reason: contains not printable characters */
    public static WebViewClient m7373(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1532 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1530 = i2 % 128;
        return ko.m8495((WebView) m7365(list, i2 % 2 != 0 ? 1 : 0, WebView.class));
    }

    /* renamed from: טּ, reason: contains not printable characters */
    public static WebChromeClient m7374(List<Object> list) {
        int i = 2 % 2;
        int i2 = f1530 + 23;
        f1532 = i2 % 128;
        return ko.m8492((WebView) m7365(list, i2 % 2 == 0 ? 1 : 0, WebView.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<Object> m7383(List<Object> list, Object... objArr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            int i2 = f1532 + 71;
            f1530 = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.addAll(list);
                throw null;
            }
            arrayList.addAll(list);
        }
        int i3 = f1532 + 61;
        f1530 = i3 % 128;
        int i4 = i3 % 2;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (((java.lang.Boolean) m7365(r4, r5, java.lang.Boolean.class)).booleanValue() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        r4 = com.ironsource.adqualitysdk.sdk.i.cz.f1530 + 85;
        com.ironsource.adqualitysdk.sdk.i.cz.f1532 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        ((java.lang.Boolean) m7365(r4, r5, java.lang.Boolean.class)).booleanValue();
        r4 = null;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r4.size() > r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r4.size() > r5) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.cz.f1532 + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        com.ironsource.adqualitysdk.sdk.i.cz.f1530 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7382(List<Object> list, int i) {
        int i2 = 2 % 2;
        int i3 = f1532 + 115;
        f1530 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 38 / 0;
        }
        return false;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7385(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f1534) ^ f1536) ^ f1538);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7387(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f1537;
            int i2 = f1535;
            if (f1533) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f1531) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }
}
