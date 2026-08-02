package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f740a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
        }
        f740a = field;
    }
}
