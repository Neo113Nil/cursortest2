package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.player.details.view.PlayerCompareView;
import com.sofascore.results.team.editteam.EditTeamDialog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yh5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yh5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View] */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Adapter adapter;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                EditTeamDialog editTeamDialog = (EditTeamDialog) obj;
                di5 B = editTeamDialog.B();
                Adapter adapter2 = adapterView.getAdapter();
                adapter2.getClass();
                B.r = (Manager) ((uh5) adapter2).getItem(i);
                FragmentActivity requireActivity = editTeamDialog.requireActivity();
                requireActivity.getClass();
                ?? currentFocus = requireActivity.getCurrentFocus();
                EditText editText = currentFocus;
                if (currentFocus == null) {
                    editText = new View(requireActivity);
                }
                EditText editText2 = editText instanceof EditText ? editText : null;
                if (editText2 != null) {
                    editText2.clearFocus();
                }
                Context context = editText.getContext();
                context.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    break;
                }
                break;
            case 1:
                LeagueEventsFragment leagueEventsFragment = (LeagueEventsFragment) obj;
                FragmentActivity requireActivity2 = leagueEventsFragment.requireActivity();
                requireActivity2.getClass();
                View currentFocus2 = requireActivity2.getCurrentFocus();
                if (currentFocus2 == null) {
                    currentFocus2 = new View(requireActivity2);
                }
                EditText editText3 = currentFocus2 instanceof EditText ? (EditText) currentFocus2 : null;
                if (editText3 != null) {
                    editText3.clearFocus();
                }
                Context context2 = currentFocus2.getContext();
                context2.getClass();
                InputMethodManager inputMethodManager2 = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                if (inputMethodManager2 != null) {
                    inputMethodManager2.hideSoftInputFromWindow(currentFocus2.getWindowToken(), 0);
                }
                Team item = (adapterView == null || (adapter = adapterView.getAdapter()) == null) ? null : adapter.getItem(i);
                Team team = item instanceof Team ? item : null;
                if (team != null) {
                    leagueEventsFragment.H(team);
                    break;
                }
                break;
            default:
                PlayerCompareView.n((PlayerCompareView) obj, i);
                break;
        }
    }
}
