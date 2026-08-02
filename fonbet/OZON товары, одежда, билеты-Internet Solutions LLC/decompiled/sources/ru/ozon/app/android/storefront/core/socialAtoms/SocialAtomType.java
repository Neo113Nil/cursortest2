package ru.ozon.app.android.storefront.core.socialAtoms;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/SocialAtomType;", "Lru/ozon/uni/atoms/data/AtomType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SOCIAL_BADGE_ATOM", "SOCIAL_TEXT_ATOM", "SOCIAL_ICON_BUTTON_ATOM", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SocialAtomType implements AtomType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SocialAtomType[] $VALUES;

    @NotNull
    private final String value;
    public static final SocialAtomType SOCIAL_BADGE_ATOM = new SocialAtomType("SOCIAL_BADGE_ATOM", 0, "socialBadgeAtom");
    public static final SocialAtomType SOCIAL_TEXT_ATOM = new SocialAtomType("SOCIAL_TEXT_ATOM", 1, "socialTextAtom");
    public static final SocialAtomType SOCIAL_ICON_BUTTON_ATOM = new SocialAtomType("SOCIAL_ICON_BUTTON_ATOM", 2, "socialIconButtonAtom");

    private static final /* synthetic */ SocialAtomType[] $values() {
        return new SocialAtomType[]{SOCIAL_BADGE_ATOM, SOCIAL_TEXT_ATOM, SOCIAL_ICON_BUTTON_ATOM};
    }

    static {
        SocialAtomType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private SocialAtomType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static SocialAtomType valueOf(String str) {
        return (SocialAtomType) Enum.valueOf(SocialAtomType.class, str);
    }

    public static SocialAtomType[] values() {
        return (SocialAtomType[]) $VALUES.clone();
    }

    @Override // ru.ozon.uni.atoms.data.AtomType
    @NotNull
    public String getValue() {
        return this.value;
    }
}
