package com.vk.feed.core.models.attachment;

import com.vk.core.serialize.Serializer;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: AttachmentStyle.kt */
/* loaded from: classes18.dex */
public final class ChipAttachmentStyle extends AttachmentStyle {
    public static final Serializer.c<ChipAttachmentStyle> CREATOR = new c();
    public final a b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachmentStyle.kt */
    public static final class ChipType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ChipType[] $VALUES;
        public static final ChipType GREY_FILE;
        public static final ChipType GREY_OTHER;
        public static final ChipType LINK;

        static {
            ChipType chipType = new ChipType("LINK", 0);
            LINK = chipType;
            ChipType chipType2 = new ChipType("GREY_FILE", 1);
            GREY_FILE = chipType2;
            ChipType chipType3 = new ChipType("GREY_OTHER", 2);
            GREY_OTHER = chipType3;
            ChipType[] chipTypeArr = {chipType, chipType2, chipType3};
            $VALUES = chipTypeArr;
            $ENTRIES = new asp(chipTypeArr);
        }

        public ChipType() {
            throw null;
        }

        public static ChipType valueOf(String str) {
            return (ChipType) Enum.valueOf(ChipType.class, str);
        }

        public static ChipType[] values() {
            return (ChipType[]) $VALUES.clone();
        }
    }

    /* compiled from: AttachmentStyle.kt */
    public static abstract class a {

        /* compiled from: AttachmentStyle.kt */
        /* renamed from: com.vk.feed.core.models.attachment.ChipAttachmentStyle$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1036a extends a {

            /* compiled from: AttachmentStyle.kt */
            /* renamed from: com.vk.feed.core.models.attachment.ChipAttachmentStyle$a$a$a, reason: collision with other inner class name */
            public static final class C1037a extends AbstractC1036a {
                public final String a;
                public final String b;

                public C1037a(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1037a)) {
                        return false;
                    }
                    C1037a c1037a = (C1037a) obj;
                    return epx.f(this.a, c1037a.a) && epx.f(this.b, c1037a.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("File(title=");
                    sb.append(this.a);
                    sb.append(", extension=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: AttachmentStyle.kt */
            /* renamed from: com.vk.feed.core.models.attachment.ChipAttachmentStyle$a$a$b */
            public static final class b extends AbstractC1036a {
                public final String a;

                public b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Other(title="), this.a, ')');
                }
            }
        }

        /* compiled from: AttachmentStyle.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Link(title="), this.a, ')');
            }
        }
    }

    /* compiled from: AttachmentStyle.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChipType.values().length];
            try {
                iArr[ChipType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChipType.GREY_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChipType.GREY_OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ChipAttachmentStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChipAttachmentStyle a(Serializer serializer) {
            a bVar;
            String H;
            ChipType chipType = (ChipType) serializer.C();
            int i = chipType == null ? -1 : b.$EnumSwitchMapping$0[chipType.ordinal()];
            if (i == 1) {
                String H2 = serializer.H();
                if (H2 != null) {
                    bVar = new a.b(H2);
                }
                bVar = null;
            } else if (i != 2) {
                if (i == 3 && (H = serializer.H()) != null) {
                    bVar = new a.AbstractC1036a.b(H);
                }
                bVar = null;
            } else {
                String H3 = serializer.H();
                if (H3 != null) {
                    String H4 = serializer.H();
                    bVar = H4 != null ? new a.AbstractC1036a.C1037a(H3, H4) : null;
                }
                bVar = null;
            }
            boolean m = serializer.m();
            if (bVar != null) {
                return new ChipAttachmentStyle(bVar, m);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChipAttachmentStyle[i];
        }
    }

    public ChipAttachmentStyle(a aVar, boolean z) {
        super(null);
        this.b = aVar;
        this.c = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        a aVar = this.b;
        if (aVar instanceof a.b) {
            serializer.g0(ChipType.LINK);
            serializer.j0(((a.b) aVar).a);
        } else if (aVar instanceof a.AbstractC1036a.C1037a) {
            serializer.g0(ChipType.GREY_FILE);
            a.AbstractC1036a.C1037a c1037a = (a.AbstractC1036a.C1037a) aVar;
            serializer.j0(c1037a.a);
            serializer.j0(c1037a.b);
        } else {
            if (!(aVar instanceof a.AbstractC1036a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            serializer.g0(ChipType.GREY_OTHER);
            serializer.j0(((a.AbstractC1036a.b) aVar).a);
        }
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    public final boolean d() {
        return this.c;
    }
}
