package com.blaze.blazesdk.extentions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.exceptions.BlazeException;
import com.blaze.blazesdk.utils.BlazeParcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"blazeDeepCopy", "T", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "(Lcom/blaze/blazesdk/utils/BlazeParcelable;)Lcom/blaze/blazesdk/utils/BlazeParcelable;", "blazesdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParcelableExtensionKt {
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0037: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:56), block:B:19:0x0037 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Keep
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends BlazeParcelable> T blazeDeepCopy(@NotNull T t) {
        Parcel parcel;
        t.getClass();
        Parcel parcel2 = null;
        try {
            try {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeTypedObject(t, 0);
                    obtain.setDataPosition(0);
                    Object obj = t.getClass().getField("CREATOR").get(null);
                    obj.getClass();
                    T t2 = (T) obtain.readTypedObject((Parcelable.Creator) obj);
                    if (t2 == null) {
                        throw new IllegalArgumentException("Failed to clone the object");
                    }
                    obtain.recycle();
                    return t2;
                } catch (Exception e) {
                    e = e;
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
                    throw new BlazeException.CloneFailureException("Failed to deep clone the object");
                }
            } catch (Throwable th) {
                th = th;
                parcel2 = parcel;
                if (parcel2 != null) {
                    parcel2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            if (parcel2 != null) {
            }
            throw th;
        }
    }
}
