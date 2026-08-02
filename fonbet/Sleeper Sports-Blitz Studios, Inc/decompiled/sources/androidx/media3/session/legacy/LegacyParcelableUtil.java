package androidx.media3.session.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.MethodNode;

/* loaded from: classes5.dex */
public final class LegacyParcelableUtil {
    private static <T> T maybeApplyMediaDescriptionParcelableBugWorkaround(T t) {
        return t;
    }

    private LegacyParcelableUtil() {
    }

    public static <T extends Parcelable, U extends Parcelable> T convert(U u, Parcelable.Creator<T> creator) {
        if (u == null) {
            return null;
        }
        Parcelable parcelable = (Parcelable) maybeApplyMediaDescriptionParcelableBugWorkaround(u);
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (T) maybeApplyMediaDescriptionParcelableBugWorkaround(creator.createFromParcel(obtain));
        } finally {
            obtain.recycle();
        }
    }

    public static <T extends Parcelable, U extends Parcelable> ArrayList<T> convertList(List<U> list, Parcelable.Creator<T> creator) {
        if (list == null) {
            return null;
        }
        MethodNode.AnonymousClass1 anonymousClass1 = (ArrayList<T>) new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            anonymousClass1.add(convert(list.get(i), creator));
        }
        return anonymousClass1;
    }

    private static android.support.v4.media.MediaDescriptionCompat rebuildMediaDescriptionCompat(android.support.v4.media.MediaDescriptionCompat mediaDescriptionCompat) {
        return new MediaDescriptionCompat.Builder().setMediaId(mediaDescriptionCompat.getMediaId()).setTitle(mediaDescriptionCompat.getTitle()).setSubtitle(mediaDescriptionCompat.getSubtitle()).setDescription(mediaDescriptionCompat.getDescription()).setIconBitmap(mediaDescriptionCompat.getIconBitmap()).setIconUri(mediaDescriptionCompat.getIconUri()).setExtras(mediaDescriptionCompat.getExtras()).setMediaUri(mediaDescriptionCompat.getMediaUri()).build();
    }
}
