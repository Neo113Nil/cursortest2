package com.vk.dto.community;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.urd0;

/* compiled from: ReBookingBannerData.kt */
/* loaded from: classes18.dex */
public final class ReBookingBannerData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ReBookingBannerData> CREATOR = new a();
    public final List<RecordData> b;

    /* compiled from: ReBookingBannerData.kt */
    public static final class RecordData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<RecordData> CREATOR = new a();
        public final int b;
        public final Staff c;
        public final List<Service> d;
        public final String e;

        /* compiled from: ReBookingBannerData.kt */
        public static final class Service extends Serializer.StreamParcelableAdapter {
            public static final Serializer.c<Service> CREATOR = new a();
            public final int b;
            public final String c;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Service> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Service a(Serializer serializer) {
                    int u = serializer.u();
                    String I = serializer.I();
                    if (I == null) {
                        I = "";
                    }
                    return new Service(u, I);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Service[i];
                }
            }

            public Service(int i, String str) {
                this.b = i;
                this.c = str;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.S(this.b);
                serializer.j0(this.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Service)) {
                    return false;
                }
                Service service = (Service) obj;
                return this.b == service.b && epx.f(this.c, service.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Service(id=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: ReBookingBannerData.kt */
        public static final class Staff extends Serializer.StreamParcelableAdapter {
            public static final Serializer.c<Staff> CREATOR = new a();
            public final int b;
            public final String c;
            public final String d;

            /* compiled from: Serializer.kt */
            public static final class a extends Serializer.c<Staff> {
                @Override // com.vk.core.serialize.Serializer.c
                public final Staff a(Serializer serializer) {
                    int u = serializer.u();
                    String I = serializer.I();
                    if (I == null) {
                        I = "";
                    }
                    String I2 = serializer.I();
                    return new Staff(u, I, I2 != null ? I2 : "");
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Staff[i];
                }
            }

            public Staff(int i, String str, String str2) {
                this.b = i;
                this.c = str;
                this.d = str2;
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.S(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Staff)) {
                    return false;
                }
                Staff staff = (Staff) obj;
                return this.b == staff.b && epx.f(this.c, staff.c) && epx.f(this.d, staff.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Staff(id=");
                sb.append(this.b);
                sb.append(", name=");
                sb.append(this.c);
                sb.append(", avatar=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<RecordData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final RecordData a(Serializer serializer) {
                int u = serializer.u();
                Staff staff = (Staff) serializer.G(Staff.class.getClassLoader());
                if (staff == null) {
                    staff = new Staff(-1, "", "");
                }
                ArrayList B = serializer.B(Service.class.getClassLoader());
                String I = serializer.I();
                return new RecordData(u, staff, B, I != null ? I : "");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecordData[i];
            }
        }

        public RecordData(int i, Staff staff, List<Service> list, String str) {
            this.b = i;
            this.c = staff;
            this.d = list;
            this.e = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.e0(this.c);
            serializer.f0(this.d);
            serializer.j0(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecordData)) {
                return false;
            }
            RecordData recordData = (RecordData) obj;
            return this.b == recordData.b && epx.f(this.c, recordData.c) && epx.f(this.d, recordData.d) && epx.f(this.e, recordData.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecordData(id=");
            sb.append(this.b);
            sb.append(", staff=");
            sb.append(this.c);
            sb.append(", services=");
            sb.append(this.d);
            sb.append(", servicesCountText=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReBookingBannerData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ReBookingBannerData a(Serializer serializer) {
            return new ReBookingBannerData(serializer.B(RecordData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReBookingBannerData[i];
        }
    }

    public ReBookingBannerData(List<RecordData> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReBookingBannerData) && epx.f(this.b, ((ReBookingBannerData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ReBookingBannerData(records="), this.b);
    }
}
