package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface z {
    boolean collapseItemActionView(n nVar, p pVar);

    boolean expandItemActionView(n nVar, p pVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, n nVar);

    void onCloseMenu(n nVar, boolean z5);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(f0 f0Var);

    void setCallback(y yVar);

    void updateMenuView(boolean z5);
}
