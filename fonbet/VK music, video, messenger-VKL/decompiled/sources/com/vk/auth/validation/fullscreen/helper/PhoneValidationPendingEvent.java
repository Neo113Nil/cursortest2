package com.vk.auth.validation.fullscreen.helper;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;
import xsna.p4g;
import xsna.par0;
import xsna.q55;
import xsna.s25;
import xsna.s3q0;

/* compiled from: PhoneValidationPendingEvent.kt */
/* loaded from: classes15.dex */
public interface PhoneValidationPendingEvent extends Parcelable {

    /* compiled from: PhoneValidationPendingEvent.kt */
    public static final class Error implements PhoneValidationPendingEvent {
        public static final Parcelable.Creator<Error> CREATOR = new a();
        public final VkPhoneValidationErrorReason b;

        /* compiled from: PhoneValidationPendingEvent.kt */
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(VkPhoneValidationErrorReason.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
            this.b = vkPhoneValidationErrorReason;
        }

        public final VkPhoneValidationErrorReason d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent
        public final void n4() {
            q55 q55Var = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).v(this.b);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b.name());
        }
    }

    /* compiled from: PhoneValidationPendingEvent.kt */
    public static final class Success implements PhoneValidationPendingEvent {
        public static final Parcelable.Creator<Success> CREATOR = new a();
        public final VkPhoneValidationCompleteResult b;

        /* compiled from: PhoneValidationPendingEvent.kt */
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((VkPhoneValidationCompleteResult) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
            this.b = vkPhoneValidationCompleteResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.auth.validation.fullscreen.helper.PhoneValidationPendingEvent
        public final void n4() {
            q55 q55Var = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).h(this.b);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
        }
    }

    void n4();
}
