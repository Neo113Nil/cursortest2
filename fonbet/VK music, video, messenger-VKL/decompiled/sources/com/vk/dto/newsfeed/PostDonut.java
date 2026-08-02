package com.vk.dto.newsfeed;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.posting.DonutPostingSettings;
import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.brm0;
import xsna.epx;
import xsna.er;
import xsna.ho8;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PostDonut.kt */
/* loaded from: classes18.dex */
public final class PostDonut extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PostDonut> CREATOR = new a();
    public final boolean b;
    public final Placeholder c;
    public final Integer d;
    public final String e;
    public final DonutPostingSettings f;
    public final Paywall g;
    public final Integer h;
    public final Boolean i;
    public final String j;
    public final String k;

    /* compiled from: PostDonut.kt */
    public static final class Paywall implements Serializer.StreamParcelable {
        public static final Serializer.c<Paywall> CREATOR = new a();
        public final String b;
        public final String c;
        public final Snippet d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Paywall> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Paywall a(Serializer serializer) {
                return new Paywall(serializer.H(), serializer.H(), (Snippet) serializer.G(Snippet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Paywall[i];
            }
        }

        public Paywall(String str, String str2, Snippet snippet) {
            this.b = str;
            this.c = str2;
            this.d = snippet;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Paywall)) {
                return false;
            }
            Paywall paywall = (Paywall) obj;
            return epx.f(this.b, paywall.b) && epx.f(this.c, paywall.c) && epx.f(this.d, paywall.d);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Snippet snippet = this.d;
            return hashCode2 + (snippet != null ? snippet.hashCode() : 0);
        }

        public final String toString() {
            return "Paywall(text=" + this.b + ", hintText=" + this.c + ", snippet=" + this.d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostDonut.kt */
    public static final class PaywallSnippetIcon {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PaywallSnippetIcon[] $VALUES;
        public static final PaywallSnippetIcon AUDIO;
        public static final a Companion;
        public static final PaywallSnippetIcon IMAGE;
        public static final PaywallSnippetIcon PLAYLIST;
        public static final PaywallSnippetIcon PODCAST;
        public static final PaywallSnippetIcon POLL;
        public static final PaywallSnippetIcon TEXT;
        public static final PaywallSnippetIcon VIDEO;

        /* compiled from: PostDonut.kt */
        public static final class a {
            public static PaywallSnippetIcon a(String str) {
                Object obj;
                Iterator<E> it = PaywallSnippetIcon.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (brm0.w(((PaywallSnippetIcon) obj).name(), str, true)) {
                        break;
                    }
                }
                return (PaywallSnippetIcon) obj;
            }
        }

        static {
            PaywallSnippetIcon paywallSnippetIcon = new PaywallSnippetIcon(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = paywallSnippetIcon;
            PaywallSnippetIcon paywallSnippetIcon2 = new PaywallSnippetIcon("IMAGE", 1);
            IMAGE = paywallSnippetIcon2;
            PaywallSnippetIcon paywallSnippetIcon3 = new PaywallSnippetIcon("POLL", 2);
            POLL = paywallSnippetIcon3;
            PaywallSnippetIcon paywallSnippetIcon4 = new PaywallSnippetIcon("PLAYLIST", 3);
            PLAYLIST = paywallSnippetIcon4;
            PaywallSnippetIcon paywallSnippetIcon5 = new PaywallSnippetIcon(SignalingProtocol.MEDIA_OPTION_AUDIO, 4);
            AUDIO = paywallSnippetIcon5;
            PaywallSnippetIcon paywallSnippetIcon6 = new PaywallSnippetIcon("PODCAST", 5);
            PODCAST = paywallSnippetIcon6;
            PaywallSnippetIcon paywallSnippetIcon7 = new PaywallSnippetIcon("TEXT", 6);
            TEXT = paywallSnippetIcon7;
            PaywallSnippetIcon[] paywallSnippetIconArr = {paywallSnippetIcon, paywallSnippetIcon2, paywallSnippetIcon3, paywallSnippetIcon4, paywallSnippetIcon5, paywallSnippetIcon6, paywallSnippetIcon7};
            $VALUES = paywallSnippetIconArr;
            $ENTRIES = new asp(paywallSnippetIconArr);
            Companion = new a();
        }

        public PaywallSnippetIcon() {
            throw null;
        }

        public static zrp<PaywallSnippetIcon> h() {
            return $ENTRIES;
        }

        public static PaywallSnippetIcon valueOf(String str) {
            return (PaywallSnippetIcon) Enum.valueOf(PaywallSnippetIcon.class, str);
        }

        public static PaywallSnippetIcon[] values() {
            return (PaywallSnippetIcon[]) $VALUES.clone();
        }
    }

    /* compiled from: PostDonut.kt */
    public static final class Placeholder implements Serializer.StreamParcelable {
        public static final Serializer.c<Placeholder> CREATOR = new a();
        public final String b;
        public final LinkButton c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Placeholder> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Placeholder a(Serializer serializer) {
                return new Placeholder(serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Placeholder[i];
            }
        }

        public Placeholder(String str, LinkButton linkButton) {
            this.b = str;
            this.c = linkButton;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placeholder)) {
                return false;
            }
            Placeholder placeholder = (Placeholder) obj;
            return epx.f(this.b, placeholder.b) && epx.f(this.c, placeholder.c);
        }

        public final int hashCode() {
            String str = this.b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            LinkButton linkButton = this.c;
            return hashCode + (linkButton != null ? linkButton.hashCode() : 0);
        }

        public final String toString() {
            return "Placeholder(text=" + this.b + ", button=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: PostDonut.kt */
    public static final class Snippet implements Serializer.StreamParcelable {
        public static final Serializer.c<Snippet> CREATOR = new a();
        public final PaywallSnippetIcon b;
        public final String c;
        public final String d;
        public final LinkButton e;
        public final Image f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Snippet> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Snippet a(Serializer serializer) {
                PaywallSnippetIcon.a aVar = PaywallSnippetIcon.Companion;
                String H = serializer.H();
                aVar.getClass();
                return new Snippet(PaywallSnippetIcon.a.a(H), serializer.H(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Snippet[i];
            }
        }

        public Snippet(PaywallSnippetIcon paywallSnippetIcon, String str, String str2, LinkButton linkButton, Image image) {
            this.b = paywallSnippetIcon;
            this.c = str;
            this.d = str2;
            this.e = linkButton;
            this.f = image;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            PaywallSnippetIcon paywallSnippetIcon = this.b;
            serializer.j0(paywallSnippetIcon != null ? paywallSnippetIcon.name() : null);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.i0(this.e);
            serializer.i0(this.f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snippet)) {
                return false;
            }
            Snippet snippet = (Snippet) obj;
            return this.b == snippet.b && epx.f(this.c, snippet.c) && epx.f(this.d, snippet.d) && epx.f(this.e, snippet.e) && epx.f(this.f, snippet.f);
        }

        public final int hashCode() {
            PaywallSnippetIcon paywallSnippetIcon = this.b;
            int hashCode = (paywallSnippetIcon == null ? 0 : paywallSnippetIcon.hashCode()) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LinkButton linkButton = this.e;
            int hashCode4 = (hashCode3 + (linkButton == null ? 0 : linkButton.hashCode())) * 31;
            Image image = this.f;
            return hashCode4 + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Snippet(icon=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", subtitle=");
            sb.append(this.d);
            sb.append(", button=");
            sb.append(this.e);
            sb.append(", image=");
            return er.d(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostDonut> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostDonut a(Serializer serializer) {
            return new PostDonut(serializer.m(), (Placeholder) serializer.G(Placeholder.class.getClassLoader()), serializer.v(), serializer.H(), (DonutPostingSettings) serializer.G(DonutPostingSettings.class.getClassLoader()), (Paywall) serializer.G(Paywall.class.getClassLoader()), serializer.v(), serializer.n(), serializer.I(), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostDonut[i];
        }
    }

    public /* synthetic */ PostDonut(boolean z, Placeholder placeholder, Integer num, String str, DonutPostingSettings donutPostingSettings, Paywall paywall, Integer num2, Boolean bool, String str2, String str3, int i, zcl zclVar) {
        this(z, placeholder, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : donutPostingSettings, (i & 32) != 0 ? null : paywall, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.i0(this.c);
        serializer.V(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.V(this.h);
        serializer.J(this.i);
        serializer.m0(this.j);
        serializer.m0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostDonut)) {
            return false;
        }
        PostDonut postDonut = (PostDonut) obj;
        return this.b == postDonut.b && epx.f(this.c, postDonut.c) && epx.f(this.d, postDonut.d) && epx.f(this.e, postDonut.e) && epx.f(this.f, postDonut.f) && epx.f(this.g, postDonut.g) && epx.f(this.h, postDonut.h) && epx.f(this.i, postDonut.i) && epx.f(this.j, postDonut.j) && epx.f(this.k, postDonut.k);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Placeholder placeholder = this.c;
        int hashCode2 = (hashCode + (placeholder == null ? 0 : placeholder.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        DonutPostingSettings donutPostingSettings = this.f;
        int hashCode5 = (hashCode4 + (donutPostingSettings == null ? 0 : donutPostingSettings.b.hashCode())) * 31;
        Paywall paywall = this.g;
        int hashCode6 = (hashCode5 + (paywall == null ? 0 : paywall.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.i;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.j;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        return hashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostDonut(isDonut=");
        sb.append(this.b);
        sb.append(", placeholder=");
        sb.append(this.c);
        sb.append(", paidDuration=");
        sb.append(this.d);
        sb.append(", editMode=");
        sb.append(this.e);
        sb.append(", durations=");
        sb.append(this.f);
        sb.append(", paywall=");
        sb.append(this.g);
        sb.append(", donutLevelId=");
        sb.append(this.h);
        sb.append(", isLevelSupported=");
        sb.append(this.i);
        sb.append(", photoAvgColor=");
        sb.append(this.j);
        sb.append(", price=");
        return ho8.a(sb, this.k, ')');
    }

    public PostDonut(boolean z, Placeholder placeholder, Integer num, String str, DonutPostingSettings donutPostingSettings, Paywall paywall, Integer num2, Boolean bool, String str2, String str3) {
        this.b = z;
        this.c = placeholder;
        this.d = num;
        this.e = str;
        this.f = donutPostingSettings;
        this.g = paywall;
        this.h = num2;
        this.i = bool;
        this.j = str2;
        this.k = str3;
    }
}
