package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.n23;
import xsna.z280;

/* loaded from: classes11.dex */
public final class Action {
    public static final int FLAG_DEFAULT = 4;
    public static final int FLAG_IS_PERSISTENT = 2;
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_CUSTOM = 1;
    static final int TYPE_STANDARD = 65536;
    private final CarColor mBackgroundColor;
    private final int mFlags;

    @Nullable
    private final CarIcon mIcon;
    private final boolean mIsEnabled;

    @Nullable
    private final z280 mOnClickDelegate;

    @Nullable
    private final CarText mTitle;
    private final int mType;
    public static final int TYPE_APP_ICON = 65538;

    @NonNull
    public static final Action APP_ICON = new Action(TYPE_APP_ICON);
    public static final int TYPE_COMPOSE_MESSAGE = 65541;

    @NonNull
    public static final Action COMPOSE_MESSAGE = new Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;

    @NonNull
    public static final Action BACK = new Action(TYPE_BACK);
    public static final int TYPE_PAN = 65540;

    @NonNull
    public static final Action PAN = new Action(TYPE_PAN);

    public static final class a {
    }

    private Action(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    public static boolean isStandardActionType(int i) {
        return (i & 65536) != 0;
    }

    @NonNull
    public static String typeToString(int i) {
        if (i == 1) {
            return "CUSTOM";
        }
        switch (i) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case TYPE_PAN /* 65540 */:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        if (Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon)) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(action.mOnClickDelegate == null)) && Integer.valueOf(this.mFlags).equals(Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getFlags() {
        return this.mFlags;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
    }

    @Nullable
    public z280 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Integer.valueOf(this.mType), Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(this.mIcon == null), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(typeToString(this.mType));
        sb.append(", icon: ");
        sb.append(this.mIcon);
        sb.append(", bkg: ");
        sb.append(this.mBackgroundColor);
        sb.append(", isEnabled: ");
        return n23.b(sb, this.mIsEnabled, X3.j.e);
    }

    public Action(a aVar) {
        throw null;
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
