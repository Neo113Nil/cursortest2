package com.vk.clips.attachments.api.publish.cta;

import android.os.Parcel;
import android.util.Log;
import com.vk.core.serialize.Serializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f0d;
import xsna.f370;
import xsna.ho8;
import xsna.qjg;
import xsna.qoy;
import xsna.rdi;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipInvolvementActionButton.kt */
/* loaded from: classes16.dex */
public abstract class ClipInvolvementActionButton<T extends Serializable> implements Serializer.StreamParcelable, bxx {
    public final ClipsInvolvementType b;
    public final T c;
    public static final b d = new b();
    public static final Serializer.c<? extends ClipInvolvementActionButton<?>> CREATOR = new c();

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final class DonutLevel extends ClipInvolvementActionButton<Integer> {
        public final int e;
        public final String f;

        public DonutLevel(int i, String str) {
            super(ClipsInvolvementType.DONUT_LEVEL, Integer.valueOf(i), null);
            this.e = i;
            this.f = str;
        }

        @Override // com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b.getType());
            serializer.g0(this.c);
            serializer.j0(this.f);
        }

        @Override // com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton, xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.e(this.b.getType(), "type");
            w9yVar.c((Integer) this.c, "value");
            w9yVar.e(this.f, "donut_level_title");
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutLevel)) {
                return false;
            }
            DonutLevel donutLevel = (DonutLevel) obj;
            return this.e == donutLevel.e && epx.f(this.f, donutLevel.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + (Integer.hashCode(this.e) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutLevel(levelId=");
            sb.append(this.e);
            sb.append(", title=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final class MessageToBusinessCommunity extends ClipInvolvementActionButton<Boolean> {
        public static final MessageToBusinessCommunity e = new MessageToBusinessCommunity(ClipsInvolvementType.MESSAGE_TO_BC, Boolean.TRUE, null);
    }

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final class OnlineBooking extends ClipInvolvementActionButton<Boolean> {
        public static final OnlineBooking e = new OnlineBooking(ClipsInvolvementType.ONLINE_BOOKING, Boolean.TRUE, null);
    }

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final class OpenChannel extends ClipInvolvementActionButton<Boolean> {
        public static final OpenChannel e = new OpenChannel(ClipsInvolvementType.OPEN_CHANNEL, Boolean.TRUE, null);
    }

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final class VkTicket extends ClipInvolvementActionButton<String> {
        public final String e;
        public final boolean f;
        public final VkTicketParams g;

        /* compiled from: ClipInvolvementActionButton.kt */
        public static final class VkTicketParams extends Serializer.StreamParcelableAdapter implements bxx {
            public static final Serializer.c<VkTicketParams> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final WallActionButtonVkTicketSeanceDto e;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<VkTicketParams> {
                @Override // com.vk.core.serialize.Serializer.c
                public final VkTicketParams a(Serializer serializer) {
                    return new VkTicketParams(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new VkTicketParams[i];
                }
            }

            public VkTicketParams() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.e0(this.e);
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", this.b);
                jSONObject.put("title", this.c);
                jSONObject.put("image", this.d);
                WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = this.e;
                if (wallActionButtonVkTicketSeanceDto != null) {
                    jSONObject.put("seance", wallActionButtonVkTicketSeanceDto.e5());
                }
                return jSONObject;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VkTicketParams)) {
                    return false;
                }
                VkTicketParams vkTicketParams = (VkTicketParams) obj;
                return epx.f(this.b, vkTicketParams.b) && epx.f(this.c, vkTicketParams.c) && epx.f(this.d, vkTicketParams.d) && epx.f(this.e, vkTicketParams.e);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = this.e;
                return hashCode3 + (wallActionButtonVkTicketSeanceDto != null ? wallActionButtonVkTicketSeanceDto.hashCode() : 0);
            }

            public final String toString() {
                return "VkTicketParams(id=" + this.b + ", title=" + this.c + ", image=" + this.d + ", seance=" + this.e + ')';
            }

            public final String zb() {
                String str;
                String str2;
                Pair pair;
                StringBuilder sb = new StringBuilder();
                sb.append(this.c);
                WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = this.e;
                if (wallActionButtonVkTicketSeanceDto != null && (str2 = wallActionButtonVkTicketSeanceDto.e) != null) {
                    try {
                        LocalDateTime parse = LocalDateTime.parse(str2, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
                        pair = new Pair(String.valueOf(parse.getDayOfMonth()), parse.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()).substring(0, 3));
                    } catch (Exception e) {
                        Log.e(qjg.a(this), "formatDateToDayMonth: " + e.getMessage());
                        pair = null;
                    }
                    if (pair != null) {
                        sb.append(" · " + ((String) pair.d()) + ' ' + ((String) pair.g()));
                    }
                }
                if (wallActionButtonVkTicketSeanceDto != null && (str = wallActionButtonVkTicketSeanceDto.d) != null) {
                    sb.append(" · ".concat(str));
                }
                return sb.toString();
            }

            public /* synthetic */ VkTicketParams(String str, String str2, String str3, WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : wallActionButtonVkTicketSeanceDto);
            }

            public VkTicketParams(String str, String str2, String str3, WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = wallActionButtonVkTicketSeanceDto;
            }

            public VkTicketParams(Serializer serializer) {
                this(serializer.H(), serializer.H(), serializer.H(), (WallActionButtonVkTicketSeanceDto) serializer.A(WallActionButtonVkTicketSeanceDto.class.getClassLoader()));
            }
        }

        /* compiled from: ClipInvolvementActionButton.kt */
        public static final class WallActionButtonVkTicketSeanceDto extends Serializer.StreamParcelableAdapter implements bxx {
            public static final Serializer.c<WallActionButtonVkTicketSeanceDto> CREATOR = new a();
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<WallActionButtonVkTicketSeanceDto> {
                @Override // com.vk.core.serialize.Serializer.c
                public final WallActionButtonVkTicketSeanceDto a(Serializer serializer) {
                    return new WallActionButtonVkTicketSeanceDto(serializer);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WallActionButtonVkTicketSeanceDto[i];
                }
            }

            public WallActionButtonVkTicketSeanceDto() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.j0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.j0(this.e);
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", this.b);
                jSONObject.put("city_alias", this.c);
                jSONObject.put("city", this.d);
                jSONObject.put("date", this.e);
                return jSONObject;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WallActionButtonVkTicketSeanceDto)) {
                    return false;
                }
                WallActionButtonVkTicketSeanceDto wallActionButtonVkTicketSeanceDto = (WallActionButtonVkTicketSeanceDto) obj;
                return epx.f(this.b, wallActionButtonVkTicketSeanceDto.b) && epx.f(this.c, wallActionButtonVkTicketSeanceDto.c) && epx.f(this.d, wallActionButtonVkTicketSeanceDto.d) && epx.f(this.e, wallActionButtonVkTicketSeanceDto.e);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.e;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("WallActionButtonVkTicketSeanceDto(id=");
                sb.append(this.b);
                sb.append(", cityAlias=");
                sb.append(this.c);
                sb.append(", city=");
                sb.append(this.d);
                sb.append(", date=");
                return ho8.a(sb, this.e, ')');
            }

            public /* synthetic */ WallActionButtonVkTicketSeanceDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
            }

            public WallActionButtonVkTicketSeanceDto(String str, String str2, String str3, String str4) {
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
            }

            public WallActionButtonVkTicketSeanceDto(Serializer serializer) {
                this(serializer.H(), serializer.H(), serializer.H(), serializer.H());
            }
        }

        public /* synthetic */ VkTicket(String str, boolean z, VkTicketParams vkTicketParams, int i, zcl zclVar) {
            this(str, z, (i & 4) != 0 ? null : vkTicketParams);
        }

        @Override // com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.L(this.f ? (byte) 1 : (byte) 0);
            serializer.e0(this.g);
        }

        @Override // com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton, xsna.bxx
        public final JSONObject e5() {
            w9y w9yVar = new w9y();
            w9yVar.e(this.b.getType(), "type");
            w9yVar.e(this.c, "value");
            w9yVar.b(Boolean.valueOf(this.f), "vk_ticket_onboarding");
            w9yVar.g("vk_ticket_info", this.g);
            s3q0 s3q0Var = s3q0.a;
            return w9yVar.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkTicket)) {
                return false;
            }
            VkTicket vkTicket = (VkTicket) obj;
            return epx.f(this.e, vkTicket.e) && this.f == vkTicket.f && epx.f(this.g, vkTicket.g);
        }

        public final int hashCode() {
            int b = qoy.b(this.e.hashCode() * 31, 31, this.f);
            VkTicketParams vkTicketParams = this.g;
            return b + (vkTicketParams == null ? 0 : vkTicketParams.hashCode());
        }

        public final String toString() {
            return "VkTicket(appUrl=" + this.e + ", isOnboardingEnabled=" + this.f + ", vkTicketInfo=" + this.g + ')';
        }

        public VkTicket(String str, boolean z, VkTicketParams vkTicketParams) {
            super(ClipsInvolvementType.VK_TICKET, str, null);
            this.e = str;
            this.f = z;
            this.g = vkTicketParams;
        }
    }

    /* compiled from: ClipInvolvementActionButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsInvolvementType.values().length];
            try {
                iArr[ClipsInvolvementType.MESSAGE_TO_BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInvolvementType.ONLINE_BOOKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsInvolvementType.OPEN_CHANNEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsInvolvementType.DONUT_LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsInvolvementType.VK_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ClipInvolvementActionButton<?>> {
        @Override // xsna.aay
        public final ClipInvolvementActionButton<?> a(JSONObject jSONObject) {
            Object obj;
            b bVar = ClipInvolvementActionButton.d;
            String A = f370.A("type", jSONObject);
            if (A == null) {
                rdi.F(null);
                return null;
            }
            Iterator<E> it = ClipsInvolvementType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ClipsInvolvementType) obj).getType(), A)) {
                    break;
                }
            }
            ClipsInvolvementType clipsInvolvementType = (ClipsInvolvementType) obj;
            if (clipsInvolvementType == null) {
                rdi.F(null);
                return null;
            }
            int i = f0d.$EnumSwitchMapping$0[clipsInvolvementType.ordinal()];
            if (i == 1) {
                return MessageToBusinessCommunity.e;
            }
            if (i == 2) {
                return OnlineBooking.e;
            }
            if (i == 3) {
                return OpenChannel.e;
            }
            if (i == 4) {
                return new DonutLevel(jSONObject.optInt("value"), jSONObject.optString("donut_level_title"));
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return new VkTicket(jSONObject.optString("value"), jSONObject.optBoolean("vk_ticket_onboarding"), null, 4, null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ClipInvolvementActionButton<?>> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipInvolvementActionButton<?> a(Serializer serializer) {
            Object obj;
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Type cannot be null");
            }
            Iterator<E> it = ClipsInvolvementType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((ClipsInvolvementType) obj).getType(), H)) {
                    break;
                }
            }
            ClipsInvolvementType clipsInvolvementType = (ClipsInvolvementType) obj;
            if (clipsInvolvementType == null) {
                throw new IllegalArgumentException("Unknown ClipsInvolvementType: ".concat(H));
            }
            int i = a.$EnumSwitchMapping$0[clipsInvolvementType.ordinal()];
            if (i == 1) {
                return MessageToBusinessCommunity.e;
            }
            if (i == 2) {
                return OnlineBooking.e;
            }
            if (i == 3) {
                return OpenChannel.e;
            }
            if (i == 4) {
                int u = serializer.u();
                String H2 = serializer.H();
                if (H2 != null) {
                    return new DonutLevel(u, H2);
                }
                throw new IllegalArgumentException("Level title cannot be null");
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            return new VkTicket(H3, serializer.m(), null, 4, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipInvolvementActionButton[i];
        }
    }

    public ClipInvolvementActionButton() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipInvolvementActionButton(ClipsInvolvementType clipsInvolvementType, Serializable serializable, zcl zclVar) {
        this.b = clipsInvolvementType;
        this.c = serializable;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.b.getType());
        serializer.g0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b.getType(), "type");
        w9yVar.e(this.c, "value");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
