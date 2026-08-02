package com.vk.dto.profile;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.ButtonAction;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatchUpBanner.kt */
/* loaded from: classes18.dex */
public final class CatchUpBanner extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatchUpBanner> CREATOR = new b();
    public final String b;
    public final ButtonAction c;
    public final String d;
    public final String e;
    public final int f;
    public final Image g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final Style l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatchUpBanner.kt */
    public static final class Style {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final a Companion;
        public static final Style NONE;
        public static final Style ONLINE_BOOKING_SECTION;
        public static final Style SOCCOM_DEFAULT_BANNER;
        private final String string;

        /* compiled from: CatchUpBanner.kt */
        public static final class a {
        }

        static {
            Style style = new Style("ONLINE_BOOKING_SECTION", 0, "online_booking_section");
            ONLINE_BOOKING_SECTION = style;
            Style style2 = new Style("SOCCOM_DEFAULT_BANNER", 1, "soccom_default_banner");
            SOCCOM_DEFAULT_BANNER = style2;
            Style style3 = new Style("NONE", 2, "");
            NONE = style3;
            Style[] styleArr = {style, style2, style3};
            $VALUES = styleArr;
            $ENTRIES = new asp(styleArr);
            Companion = new a();
        }

        public Style(String str, int i, String str2) {
            this.string = str2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        public final String h() {
            return this.string;
        }
    }

    /* compiled from: CatchUpBanner.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String, xsna.zcl] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        public static CatchUpBanner a(JSONObject jSONObject) {
            CatchUpBanner catchUpBanner;
            Style style;
            CatchUpBanner catchUpBanner2 = 0;
            catchUpBanner2 = 0;
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("banner");
                if (optJSONObject == null) {
                    optJSONObject = jSONObject;
                }
                String optString = optJSONObject.optString("banner_id");
                ButtonAction buttonAction = new ButtonAction(optJSONObject.optJSONObject("action"));
                String optString2 = optJSONObject.optString("title", "");
                String optString3 = optJSONObject.optString("description", "");
                int optInt = optJSONObject.optInt("ttl", 10);
                Image image = new Image(optJSONObject.optJSONArray("icon"), catchUpBanner2, 2, catchUpBanner2);
                boolean optBoolean = optJSONObject.optBoolean("allow_hide", true);
                String optString4 = optJSONObject.optString("background_color");
                String optString5 = optJSONObject.optString("track_code");
                String optString6 = optJSONObject.optString(X3.i.F0);
                Style.a aVar = Style.Companion;
                String optString7 = optJSONObject.optString(TtmlNode.TAG_STYLE);
                aVar.getClass();
                Style[] values = Style.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        catchUpBanner = catchUpBanner2;
                        style = Style.NONE;
                        break;
                    }
                    style = values[i];
                    catchUpBanner = catchUpBanner2;
                    try {
                        if (epx.f(style.h(), optString7)) {
                            break;
                        }
                        i++;
                        catchUpBanner2 = catchUpBanner;
                    } catch (Exception unused) {
                        return catchUpBanner;
                    }
                }
                return new CatchUpBanner(optString, buttonAction, optString2, optString3, optInt, image, optBoolean, optString4, optString5, optString6, style);
            } catch (Exception unused2) {
                return catchUpBanner2;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatchUpBanner> {
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // com.vk.core.serialize.Serializer.c
        public final com.vk.dto.profile.CatchUpBanner a(com.vk.core.serialize.Serializer r18) {
            /*
                r17 = this;
                r0 = r18
                com.vk.dto.profile.CatchUpBanner r1 = new com.vk.dto.profile.CatchUpBanner
                r2 = r1
                java.lang.String r1 = r0.H()
                java.lang.Class<com.vk.dto.newsfeed.ButtonAction> r3 = com.vk.dto.newsfeed.ButtonAction.class
                java.lang.ClassLoader r3 = r3.getClassLoader()
                com.vk.core.serialize.Serializer$StreamParcelable r3 = r0.G(r3)
                com.vk.dto.newsfeed.ButtonAction r3 = (com.vk.dto.newsfeed.ButtonAction) r3
                r4 = r2
                r2 = r3
                java.lang.String r3 = r0.H()
                r5 = r4
                java.lang.String r4 = r0.H()
                r6 = r5
                int r5 = r0.u()
                java.lang.Class<com.vk.dto.common.Image> r7 = com.vk.dto.common.Image.class
                java.lang.ClassLoader r7 = r7.getClassLoader()
                com.vk.core.serialize.Serializer$StreamParcelable r7 = r0.G(r7)
                com.vk.dto.common.Image r7 = (com.vk.dto.common.Image) r7
                r0 = r6
                r6 = r7
                boolean r7 = r18.m()
                java.lang.String r8 = r18.H()
                java.lang.String r9 = r18.H()
                java.lang.String r10 = r18.H()
                com.vk.dto.profile.CatchUpBanner$Style$a r11 = com.vk.dto.profile.CatchUpBanner.Style.Companion
                java.lang.String r12 = r18.H()
                if (r12 != 0) goto L4d
                java.lang.String r12 = ""
            L4d:
                r11.getClass()
                com.vk.dto.profile.CatchUpBanner$Style[] r11 = com.vk.dto.profile.CatchUpBanner.Style.values()
                int r13 = r11.length
                r14 = 0
            L56:
                if (r14 >= r13) goto L6f
                r15 = r11[r14]
                r16 = r0
                java.lang.String r0 = r15.h()
                boolean r0 = xsna.epx.f(r0, r12)
                if (r0 == 0) goto L6a
                r11 = r15
                r0 = r16
                goto L74
            L6a:
                int r14 = r14 + 1
                r0 = r16
                goto L56
            L6f:
                r16 = r0
                com.vk.dto.profile.CatchUpBanner$Style r15 = com.vk.dto.profile.CatchUpBanner.Style.NONE
                r11 = r15
            L74:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.profile.CatchUpBanner.b.a(com.vk.core.serialize.Serializer):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatchUpBanner[i];
        }
    }

    public /* synthetic */ CatchUpBanner(String str, ButtonAction buttonAction, String str2, String str3, int i, Image image, boolean z, String str4, String str5, String str6, Style style, int i2, zcl zclVar) {
        this(str, buttonAction, str2, str3, i, image, z, str4, str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : style);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.i0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        Style style = this.l;
        serializer.j0(style != null ? style.h() : null);
    }

    public CatchUpBanner(String str, ButtonAction buttonAction, String str2, String str3, int i, Image image, boolean z, String str4, String str5, String str6, Style style) {
        this.b = str;
        this.c = buttonAction;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = image;
        this.h = z;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = style;
    }
}
