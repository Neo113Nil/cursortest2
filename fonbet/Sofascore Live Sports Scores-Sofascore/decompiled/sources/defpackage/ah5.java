package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.Country;
import com.sofascore.model.GridItem;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.dialog.PlayerPositionsModal;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverDetailsFragment;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ah5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        Object[] objArr = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((j15) obj2).e.clearFocus();
                ((EditPlayerDialog) obj).v();
                Object item = adapterView.getAdapter().getItem(i);
                item.getClass();
                return;
            case 1:
                ((k15) obj2).b.clearFocus();
                sh5 v = ((EditPlayerTransferDialog) obj).v();
                Object item2 = adapterView.getAdapter().getItem(i);
                item2.getClass();
                v.u = (String) item2;
                return;
            case 2:
                ManagerDetailsFragment managerDetailsFragment = (ManagerDetailsFragment) obj2;
                Country country = (Country) obj;
                Object item3 = adapterView.getAdapter().getItem(i);
                if ((item3 instanceof GridItem) && ((GridItem) item3).getDescription().equals(managerDetailsFragment.getString(R.string.nationality)) && country != null) {
                    Calendar calendar = ke0.a;
                    Context requireContext = managerDetailsFragment.requireContext();
                    requireContext.getClass();
                    Context requireContext2 = managerDetailsFragment.requireContext();
                    requireContext2.getClass();
                    ke0.g(requireContext, tv3.c(requireContext2, country.getName()), 0);
                    return;
                }
                return;
            case 3:
                MmaFighterDetailsFragment mmaFighterDetailsFragment = (MmaFighterDetailsFragment) obj2;
                Country country2 = (Country) obj;
                Object item4 = adapterView.getAdapter().getItem(i);
                if ((item4 instanceof GridItem) && ((GridItem) item4).getDescription().equals(mmaFighterDetailsFragment.getString(R.string.nationality)) && country2 != null) {
                    Calendar calendar2 = ke0.a;
                    Context requireContext3 = mmaFighterDetailsFragment.requireContext();
                    requireContext3.getClass();
                    Context requireContext4 = mmaFighterDetailsFragment.requireContext();
                    requireContext4.getClass();
                    ke0.g(requireContext3, tv3.c(requireContext4, country2.getName()), 0);
                    return;
                }
                return;
            case 4:
                Context context = ((zue) obj2).getContext();
                context.getClass();
                PlayerPositionsModal playerPositionsModal = new PlayerPositionsModal();
                Bundle bundle = new Bundle();
                bundle.putSerializable("GENDER", (Gender) obj);
                playerPositionsModal.setArguments(bundle);
                if (context instanceof csk) {
                    context = ((csk) context).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(playerPositionsModal, appCompatActivity, objArr == true ? 1 : 0, 3));
                    return;
                }
                return;
            case 5:
                RefereeDetailsFragment refereeDetailsFragment = (RefereeDetailsFragment) obj2;
                Country country3 = (Country) obj;
                Object item5 = adapterView.getAdapter().getItem(i);
                if ((item5 instanceof GridItem) && ((GridItem) item5).getDescription().equals(refereeDetailsFragment.getString(R.string.nationality)) && country3 != null) {
                    Calendar calendar3 = ke0.a;
                    Context requireContext5 = refereeDetailsFragment.requireContext();
                    requireContext5.getClass();
                    Context requireContext6 = refereeDetailsFragment.requireContext();
                    requireContext6.getClass();
                    ke0.g(requireContext5, tv3.c(requireContext6, country3.getName()), 0);
                    return;
                }
                return;
            case 6:
                StageDriverDetailsFragment stageDriverDetailsFragment = (StageDriverDetailsFragment) obj2;
                Team team = (Team) obj;
                if (adapterView.getAdapter().getItem(i) instanceof GridItem) {
                    Object item6 = adapterView.getAdapter().getItem(i);
                    item6.getClass();
                    if (Intrinsics.c(((GridItem) item6).getDescription(), stageDriverDetailsFragment.getString(R.string.nationality))) {
                        ArrayList arrayList = dv3.a;
                        com.sofascore.model.mvvm.model.Country country4 = team.getCountry();
                        Country a = dv3.a(country4 != null ? country4.getAlpha2() : null);
                        if (a != null) {
                            Calendar calendar4 = ke0.a;
                            Context requireContext7 = stageDriverDetailsFragment.requireContext();
                            requireContext7.getClass();
                            Context requireContext8 = stageDriverDetailsFragment.requireContext();
                            requireContext8.getClass();
                            ke0.g(requireContext7, tv3.c(requireContext8, a.getName()), 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                TransferFilterModal transferFilterModal = (TransferFilterModal) obj2;
                Object item7 = ((eh5) obj).getItem(i);
                item7.getClass();
                transferFilterModal.z = (Country) item7;
                js2 js2Var = transferFilterModal.x;
                if (js2Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) js2Var.f;
                Context context2 = autoCompleteTextView.getContext();
                context2.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context2.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(autoCompleteTextView.getWindowToken(), 0);
                    return;
                }
                return;
            default:
                TransferFilterModal transferFilterModal2 = (TransferFilterModal) obj2;
                Object obj3 = ((dxe) obj).c.get(i);
                obj3.getClass();
                transferFilterModal2.A = (UniqueTournament) obj3;
                transferFilterModal2.G(true);
                js2 js2Var2 = transferFilterModal2.x;
                if (js2Var2 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) js2Var2.m;
                Context context3 = autoCompleteTextView2.getContext();
                context3.getClass();
                InputMethodManager inputMethodManager2 = (InputMethodManager) context3.getSystemService(InputMethodManager.class);
                if (inputMethodManager2 != null) {
                    inputMethodManager2.hideSoftInputFromWindow(autoCompleteTextView2.getWindowToken(), 0);
                    return;
                }
                return;
        }
    }
}
