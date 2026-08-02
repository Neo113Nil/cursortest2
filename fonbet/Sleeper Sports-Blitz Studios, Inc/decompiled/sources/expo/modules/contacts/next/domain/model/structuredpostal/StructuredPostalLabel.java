package expo.modules.contacts.next.domain.model.structuredpostal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StructuredPostalLabel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "", "type", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLabel", "()Ljava/lang/String;", "Home", "Work", "Other", TypedValues.Custom.NAME, "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Home;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Other;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Work;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StructuredPostalLabel {
    private final String label;
    private final int type;

    public /* synthetic */ StructuredPostalLabel(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* compiled from: StructuredPostalLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Home;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Home extends StructuredPostalLabel {
        public static final Home INSTANCE = new Home();

        /* JADX WARN: Multi-variable type inference failed */
        private Home() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    private StructuredPostalLabel(int i, String str) {
        this.type = i;
        this.label = str;
    }

    public /* synthetic */ StructuredPostalLabel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, null);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    /* compiled from: StructuredPostalLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Work;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Work extends StructuredPostalLabel {
        public static final Work INSTANCE = new Work();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Work() {
            super(r0, null, r0, 0 == true ? 1 : 0);
            int i = 2;
        }
    }

    /* compiled from: StructuredPostalLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Other;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Other extends StructuredPostalLabel {
        public static final Other INSTANCE = new Other();

        /* JADX WARN: Multi-variable type inference failed */
        private Other() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: StructuredPostalLabel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/structuredpostal/StructuredPostalLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Custom extends StructuredPostalLabel {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String label) {
            super(0, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }
}
