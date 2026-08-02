package expo.modules.contacts.next.domain.model.nickname;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.Profile;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NicknameLabel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u001d\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "", "type", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getLabel", "()Ljava/lang/String;", Profile.DEFAULT_PROFILE_NAME, "OtherName", "MaidenName", "ShortName", "Initials", TypedValues.Custom.NAME, "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Default;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Initials;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$MaidenName;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$OtherName;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$ShortName;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class NicknameLabel {
    private final String label;
    private final int type;

    public /* synthetic */ NicknameLabel(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Default;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default extends NicknameLabel {
        public static final Default INSTANCE = new Default();

        /* JADX WARN: Multi-variable type inference failed */
        private Default() {
            super(1, null, 2, 0 == true ? 1 : 0);
        }
    }

    private NicknameLabel(int i, String str) {
        this.type = i;
        this.label = str;
    }

    public /* synthetic */ NicknameLabel(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, null);
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$OtherName;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OtherName extends NicknameLabel {
        public static final OtherName INSTANCE = new OtherName();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private OtherName() {
            super(r0, null, r0, 0 == true ? 1 : 0);
            int i = 2;
        }
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$MaidenName;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MaidenName extends NicknameLabel {
        public static final MaidenName INSTANCE = new MaidenName();

        /* JADX WARN: Multi-variable type inference failed */
        private MaidenName() {
            super(3, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$ShortName;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShortName extends NicknameLabel {
        public static final ShortName INSTANCE = new ShortName();

        /* JADX WARN: Multi-variable type inference failed */
        private ShortName() {
            super(4, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Initials;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", "<init>", "()V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Initials extends NicknameLabel {
        public static final Initials INSTANCE = new Initials();

        /* JADX WARN: Multi-variable type inference failed */
        private Initials() {
            super(5, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: NicknameLabel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel$Custom;", "Lexpo/modules/contacts/next/domain/model/nickname/NicknameLabel;", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Custom extends NicknameLabel {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String label) {
            super(0, label, null);
            Intrinsics.checkNotNullParameter(label, "label");
        }
    }
}
