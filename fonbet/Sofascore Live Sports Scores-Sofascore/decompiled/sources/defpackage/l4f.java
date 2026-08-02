package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l4f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference a;

    public l4f(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence e = preference.e();
        if (!preference.B || TextUtils.isEmpty(e)) {
            return;
        }
        contextMenu.setHeaderTitle(e);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.a;
        Context context = preference.a;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence e = preference.e();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", e));
        Toast.makeText(context, context.getString(R.string.preference_copied, e), 0).show();
        return true;
    }
}
