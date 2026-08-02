package com.vk.dto.group.creation_onboarding;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.C4504q2;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: GroupCreationOnboardingBlock.kt */
/* loaded from: classes18.dex */
public final class GroupCreationOnboardingBlock extends Serializer.StreamParcelableAdapter {
    public final Step b;
    public final String c;
    public final String d;
    public final String e;
    public final Progress f;
    public final List<Option> g;
    public final String h;
    public final GroupCreationOnboardingModal i;
    public final GroupCreationOnboardingModal j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCreationOnboardingBlock.kt */
    public static final class Step {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Step[] $VALUES;
        public static final Step CLIPS;
        public static final a Companion;
        public static final Step DESIGN;
        public static final Step FINISH;
        public static final Step MARKET;
        public static final Step POSTING;
        public static final Step REGULAR_POSTING;
        public static final Step SUBSCRIBERS;
        public static final Step UNKNOWN;
        private final String key;

        /* compiled from: GroupCreationOnboardingBlock.kt */
        public static final class a {
        }

        static {
            Step step = new Step("DESIGN", 0, "screen_design");
            DESIGN = step;
            Step step2 = new Step("POSTING", 1, "screen_posting");
            POSTING = step2;
            Step step3 = new Step("SUBSCRIBERS", 2, "screen_subscribers");
            SUBSCRIBERS = step3;
            Step step4 = new Step("CLIPS", 3, "screen_clips");
            CLIPS = step4;
            Step step5 = new Step("REGULAR_POSTING", 4, "screen_regular_posting");
            REGULAR_POSTING = step5;
            Step step6 = new Step("FINISH", 5, "screen_finish");
            FINISH = step6;
            Step step7 = new Step("MARKET", 6, "screen_market_items");
            MARKET = step7;
            Step step8 = new Step(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7, "unknown");
            UNKNOWN = step8;
            Step[] stepArr = {step, step2, step3, step4, step5, step6, step7, step8};
            $VALUES = stepArr;
            $ENTRIES = new asp(stepArr);
            Companion = new a();
        }

        public Step(String str, int i, String str2) {
            this.key = str2;
        }

        public static zrp<Step> h() {
            return $ENTRIES;
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }

        public final String i() {
            return this.key;
        }
    }

    /* compiled from: GroupCreationOnboardingBlock.kt */
    public static final class a {
        public static List a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return EmptyList.b;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("subtitle");
                int optInt = jSONObject.optInt(C4504q2.u);
                Option.Status.a aVar = Option.Status.Companion;
                String optString3 = jSONObject.optString("type");
                aVar.getClass();
                arrayList.add(new Option(optString, optString2, Option.Status.a.a(optString3), optInt, jSONObject.optString("entity_id"), jSONObject.optString("image"), jSONObject.optBoolean("is_completed"), jSONObject.optString("url")));
            }
            return arrayList;
        }
    }

    public GroupCreationOnboardingBlock(Step step, String str, String str2, String str3, Progress progress, List<Option> list, String str4, GroupCreationOnboardingModal groupCreationOnboardingModal, GroupCreationOnboardingModal groupCreationOnboardingModal2) {
        this.b = step;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = progress;
        this.g = list;
        this.h = str4;
        this.i = groupCreationOnboardingModal;
        this.j = groupCreationOnboardingModal2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.i());
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.f0(this.g);
        serializer.e0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreationOnboardingBlock)) {
            return false;
        }
        GroupCreationOnboardingBlock groupCreationOnboardingBlock = (GroupCreationOnboardingBlock) obj;
        return this.b == groupCreationOnboardingBlock.b && epx.f(this.c, groupCreationOnboardingBlock.c) && epx.f(this.d, groupCreationOnboardingBlock.d) && epx.f(this.e, groupCreationOnboardingBlock.e) && epx.f(this.f, groupCreationOnboardingBlock.f) && epx.f(this.g, groupCreationOnboardingBlock.g) && epx.f(this.h, groupCreationOnboardingBlock.h) && epx.f(this.i, groupCreationOnboardingBlock.i) && epx.f(this.j, groupCreationOnboardingBlock.j);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        Progress progress = this.f;
        int a3 = fw3.a((a2 + (progress == null ? 0 : progress.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int hashCode = (a3 + (str == null ? 0 : str.hashCode())) * 31;
        GroupCreationOnboardingModal groupCreationOnboardingModal = this.i;
        int hashCode2 = (hashCode + (groupCreationOnboardingModal == null ? 0 : groupCreationOnboardingModal.hashCode())) * 31;
        GroupCreationOnboardingModal groupCreationOnboardingModal2 = this.j;
        return hashCode2 + (groupCreationOnboardingModal2 != null ? groupCreationOnboardingModal2.hashCode() : 0);
    }

    public final String toString() {
        return "GroupCreationOnboardingBlock(step=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", imageUrl=" + this.e + ", progress=" + this.f + ", items=" + this.g + ", buttonText=" + this.h + ", modal=" + this.i + ", additionalModal=" + this.j + ')';
    }

    /* compiled from: GroupCreationOnboardingBlock.kt */
    public static final class Progress extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<Progress> CREATOR = new a();
        public final int b;
        public final int c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Progress> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Progress a(Serializer serializer) {
                return new Progress(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Progress[i];
            }
        }

        public Progress(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.S(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return this.b == progress.b && this.c == progress.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(max=");
            sb.append(this.b);
            sb.append(", current=");
            return vu5.b(sb, this.c, ')');
        }

        public Progress(Serializer serializer) {
            this(serializer.u(), serializer.u());
        }
    }

    /* compiled from: GroupCreationOnboardingBlock.kt */
    public static final class Option extends Serializer.StreamParcelableAdapter {
        public final String b;
        public final String c;
        public final Status d;
        public final int e;
        public final String f;
        public final String g;
        public final boolean h;
        public final String i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupCreationOnboardingBlock.kt */
        public static final class Status {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status ACTION_BUTTON;
            public static final Status ADS;
            public static final Status AVATAR;
            public static final Status CONTACTS;
            public static final Status COPY;
            public static final Status COVER;
            public static final Serializer.c<Option> CREATOR;
            public static final a Companion;
            public static final Status DEFAULT;
            public static final Status DESCRIPTION;
            public static final Status DISABLED;
            public static final Status DONE;
            public static final Status GOODS;
            public static final Status INVITE_FRIENDS;
            public static final Status NOT_COMPLETED;
            public static final Status POST;
            public static final Status SERVICES;
            public static final Status STORY;
            public static final Status UNKNOWN;

            /* compiled from: GroupCreationOnboardingBlock.kt */
            public static final class a {
                public static Status a(String str) {
                    Object obj;
                    Iterator<E> it = Status.h().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (cqm0.m(((Status) obj).name()).equals(str)) {
                            break;
                        }
                    }
                    Status status = (Status) obj;
                    return status == null ? Status.UNKNOWN : status;
                }
            }

            /* compiled from: Serializer.kt */
            public static final class b extends Serializer.c<Option> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Option a(Serializer serializer) {
                    return new Option(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Option[i];
                }
            }

            static {
                Status status = new Status(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
                UNKNOWN = status;
                Status status2 = new Status("DEFAULT", 1);
                DEFAULT = status2;
                Status status3 = new Status("DISABLED", 2);
                DISABLED = status3;
                Status status4 = new Status("NOT_COMPLETED", 3);
                NOT_COMPLETED = status4;
                Status status5 = new Status("DONE", 4);
                DONE = status5;
                Status status6 = new Status("COVER", 5);
                COVER = status6;
                Status status7 = new Status(NativeAdContent.ViewTag.AD_DESCRIPTION, 6);
                DESCRIPTION = status7;
                Status status8 = new Status("AVATAR", 7);
                AVATAR = status8;
                Status status9 = new Status("CONTACTS", 8);
                CONTACTS = status9;
                Status status10 = new Status("ACTION_BUTTON", 9);
                ACTION_BUTTON = status10;
                Status status11 = new Status("INVITE_FRIENDS", 10);
                INVITE_FRIENDS = status11;
                Status status12 = new Status("STORY", 11);
                STORY = status12;
                Status status13 = new Status("POST", 12);
                POST = status13;
                Status status14 = new Status("COPY", 13);
                COPY = status14;
                Status status15 = new Status("ADS", 14);
                ADS = status15;
                Status status16 = new Status("GOODS", 15);
                GOODS = status16;
                Status status17 = new Status("SERVICES", 16);
                SERVICES = status17;
                Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12, status13, status14, status15, status16, status17};
                $VALUES = statusArr;
                $ENTRIES = new asp(statusArr);
                Companion = new a();
                CREATOR = new b();
            }

            public Status() {
                throw null;
            }

            public static zrp<Status> h() {
                return $ENTRIES;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }

        public Option(String str, String str2, Status status, int i, String str3, String str4, boolean z, String str5) {
            this.b = str;
            this.c = str2;
            this.d = status;
            this.e = i;
            this.f = str3;
            this.g = str4;
            this.h = z;
            this.i = str5;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d.name());
            serializer.S(this.e);
            serializer.j0(this.f);
            serializer.j0(this.g);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.j0(this.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return epx.f(this.b, option.b) && epx.f(this.c, option.c) && this.d == option.d && this.e == option.e && epx.f(this.f, option.f) && epx.f(this.g, option.g) && this.h == option.h && epx.f(this.i, option.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + qoy.b(urd0.a(urd0.a(shy.a(this.e, (this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Option(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", order=");
            sb.append(this.e);
            sb.append(", entityId=");
            sb.append(this.f);
            sb.append(", imageUrl=");
            sb.append(this.g);
            sb.append(", isCompleted=");
            sb.append(this.h);
            sb.append(", url=");
            return ho8.a(sb, this.i, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Option(Serializer serializer) {
            this(r3, r4, r5, r6, r7, r8, r9, r12 == null ? "" : r12);
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String str2 = H2 == null ? "" : H2;
            Status.a aVar = Status.Companion;
            String H3 = serializer.H();
            H3 = H3 == null ? "" : H3;
            aVar.getClass();
            Status a = Status.a.a(H3);
            int u = serializer.u();
            String H4 = serializer.H();
            String str3 = H4 == null ? "" : H4;
            String H5 = serializer.H();
            String str4 = H5 == null ? "" : H5;
            boolean m = serializer.m();
            String H6 = serializer.H();
        }
    }
}
