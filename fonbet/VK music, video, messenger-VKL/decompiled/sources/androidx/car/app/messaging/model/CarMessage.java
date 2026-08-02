package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarText;
import java.util.Objects;
import xsna.fai;
import xsna.j1a0;

/* loaded from: classes11.dex */
public class CarMessage {

    @Nullable
    private final CarText mBody;
    private final boolean mIsRead;

    @Nullable
    private final String mMultimediaMimeType;

    @Nullable
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;

    @Nullable
    private final Bundle mSender;

    public static final class a {
    }

    public CarMessage(@NonNull a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return fai.e(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    @Nullable
    public CarText getBody() {
        return this.mBody;
    }

    @Nullable
    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    @Nullable
    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    @Nullable
    public j1a0 getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return j1a0.a(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(fai.r(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }
}
