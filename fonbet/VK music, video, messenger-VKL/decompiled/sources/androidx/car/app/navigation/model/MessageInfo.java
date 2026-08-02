package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.navigation.model.NavigationTemplate;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class MessageInfo implements NavigationTemplate.b {

    @Nullable
    private final CarIcon mImage;

    @Nullable
    private final CarText mText;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public MessageInfo(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return Objects.equals(this.mTitle, messageInfo.mTitle) && Objects.equals(this.mText, messageInfo.mText) && Objects.equals(this.mImage, messageInfo.mImage);
    }

    @Nullable
    public CarIcon getImage() {
        return this.mImage;
    }

    @Nullable
    public CarText getText() {
        return this.mText;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mText, this.mImage);
    }

    @NonNull
    public String toString() {
        return "MessageInfo";
    }

    private MessageInfo() {
        this.mTitle = null;
        this.mText = null;
        this.mImage = null;
    }
}
