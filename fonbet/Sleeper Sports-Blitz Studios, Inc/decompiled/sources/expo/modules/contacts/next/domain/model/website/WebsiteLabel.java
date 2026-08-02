package expo.modules.contacts.next.domain.model.website;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebsiteLabel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "", "type", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLabel", "()Ljava/lang/String;", "Homepage", "Blog", "Ftp", "Home", "Work", "Other", "Profile", TypedValues.Custom.NAME, "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Blog;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Ftp;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Home;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Homepage;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Other;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Profile;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Work;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class WebsiteLabel {
    private final String label;
    private final int type;

    public /* synthetic */ WebsiteLabel(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Homepage;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Homepage extends WebsiteLabel {
        public static final Homepage INSTANCE = new Homepage();

        /* JADX WARN: Multi-variable type inference failed */
        private Homepage() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    private WebsiteLabel(int i, String str) {
        this.type = i;
        this.label = str;
    }

    public /* synthetic */ WebsiteLabel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, null);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Blog;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Blog extends WebsiteLabel {
        public static final Blog INSTANCE = new Blog();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Blog() {
            super(r0, null, r0, 0 == true ? 1 : 0);
            int i = 2;
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Ftp;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ftp extends WebsiteLabel {
        public static final Ftp INSTANCE = new Ftp();

        /* JADX WARN: Multi-variable type inference failed */
        private Ftp() {
            super(6, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Home;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Home extends WebsiteLabel {
        public static final Home INSTANCE = new Home();

        /* JADX WARN: Multi-variable type inference failed */
        private Home() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Work;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Work extends WebsiteLabel {
        public static final Work INSTANCE = new Work();

        /* JADX WARN: Multi-variable type inference failed */
        private Work() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Other;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Other extends WebsiteLabel {
        public static final Other INSTANCE = new Other();

        /* JADX WARN: Multi-variable type inference failed */
        private Other() {
            super(7, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Profile;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Profile extends WebsiteLabel {
        public static final Profile INSTANCE = new Profile();

        /* JADX WARN: Multi-variable type inference failed */
        private Profile() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WebsiteLabel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/website/WebsiteLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Custom extends WebsiteLabel {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String label) {
            super(0, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }
}
