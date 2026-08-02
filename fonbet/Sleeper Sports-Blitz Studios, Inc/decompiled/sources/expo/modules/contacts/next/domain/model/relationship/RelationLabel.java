package expo.modules.contacts.next.domain.model.relationship;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RelationLabel.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u000f\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "", "type", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLabel", "()Ljava/lang/String;", "Assistant", "Brother", "Child", "DomesticPartner", "Father", "Friend", "Manager", "Mother", "Parent", "Partner", "ReferredBy", "Relative", "Sister", "Spouse", TypedValues.Custom.NAME, "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Assistant;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Brother;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Child;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$DomesticPartner;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Father;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Friend;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Manager;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Mother;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Parent;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Partner;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$ReferredBy;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Relative;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Sister;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Spouse;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class RelationLabel {
    private final String label;
    private final int type;

    public /* synthetic */ RelationLabel(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Assistant;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Assistant extends RelationLabel {
        public static final Assistant INSTANCE = new Assistant();

        /* JADX WARN: Multi-variable type inference failed */
        private Assistant() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    private RelationLabel(int i, String str) {
        this.type = i;
        this.label = str;
    }

    public /* synthetic */ RelationLabel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, null);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Brother;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Brother extends RelationLabel {
        public static final Brother INSTANCE = new Brother();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Brother() {
            super(r0, null, r0, 0 == true ? 1 : 0);
            int i = 2;
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Child;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Child extends RelationLabel {
        public static final Child INSTANCE = new Child();

        /* JADX WARN: Multi-variable type inference failed */
        private Child() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$DomesticPartner;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DomesticPartner extends RelationLabel {
        public static final DomesticPartner INSTANCE = new DomesticPartner();

        /* JADX WARN: Multi-variable type inference failed */
        private DomesticPartner() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Father;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Father extends RelationLabel {
        public static final Father INSTANCE = new Father();

        /* JADX WARN: Multi-variable type inference failed */
        private Father() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Friend;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Friend extends RelationLabel {
        public static final Friend INSTANCE = new Friend();

        /* JADX WARN: Multi-variable type inference failed */
        private Friend() {
            super(6, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Manager;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Manager extends RelationLabel {
        public static final Manager INSTANCE = new Manager();

        /* JADX WARN: Multi-variable type inference failed */
        private Manager() {
            super(7, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Mother;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Mother extends RelationLabel {
        public static final Mother INSTANCE = new Mother();

        /* JADX WARN: Multi-variable type inference failed */
        private Mother() {
            super(8, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Parent;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parent extends RelationLabel {
        public static final Parent INSTANCE = new Parent();

        /* JADX WARN: Multi-variable type inference failed */
        private Parent() {
            super(9, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Partner;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Partner extends RelationLabel {
        public static final Partner INSTANCE = new Partner();

        /* JADX WARN: Multi-variable type inference failed */
        private Partner() {
            super(10, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$ReferredBy;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReferredBy extends RelationLabel {
        public static final ReferredBy INSTANCE = new ReferredBy();

        /* JADX WARN: Multi-variable type inference failed */
        private ReferredBy() {
            super(11, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Relative;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Relative extends RelationLabel {
        public static final Relative INSTANCE = new Relative();

        /* JADX WARN: Multi-variable type inference failed */
        private Relative() {
            super(12, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Sister;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Sister extends RelationLabel {
        public static final Sister INSTANCE = new Sister();

        /* JADX WARN: Multi-variable type inference failed */
        private Sister() {
            super(13, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Spouse;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Spouse extends RelationLabel {
        public static final Spouse INSTANCE = new Spouse();

        /* JADX WARN: Multi-variable type inference failed */
        private Spouse() {
            super(14, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RelationLabel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/relationship/RelationLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Custom extends RelationLabel {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String label) {
            super(0, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }
}
