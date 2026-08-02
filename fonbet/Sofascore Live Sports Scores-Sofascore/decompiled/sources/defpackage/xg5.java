package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.post.FighterSuggestPostBody;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import com.sofascore.results.player.EditPlayerDialog;
import com.sofascore.results.player.EditPlayerTransferDialog;
import com.sofascore.results.team.editteam.EditTeamDialog;
import com.sofascore.results.view.SofaTextInputLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xg5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xg5(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013f, code lost:
    
        if (r6 != 7) goto L46;
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                j15 j15Var = (j15) obj3;
                j15Var.k.clearFocus();
                th5 v = ((EditPlayerDialog) obj2).v();
                ArrayList arrayList = (ArrayList) ((pm) obj).c;
                v.n = (String) CollectionsKt.a0(i, arrayList);
                if (i == arrayList.size() - 1) {
                    j15Var.t.setText("");
                    break;
                }
                break;
            case 1:
                j15 j15Var2 = (j15) obj3;
                j15Var2.l.clearFocus();
                th5 v2 = ((EditPlayerDialog) obj2).v();
                List list = ((wg5) obj).b;
                v2.m = (String) CollectionsKt.a0(i, list);
                if (i == list.size() - 1) {
                    j15Var2.u.setText("");
                    break;
                }
                break;
            case 2:
                j15 j15Var3 = (j15) obj3;
                eh5 eh5Var = (eh5) obj;
                j15Var3.f.clearFocus();
                Country country = (Country) adapterView.getAdapter().getItem(i);
                ((EditPlayerDialog) obj2).v().o = country != null ? country.getIso3Alpha() : null;
                if (i == ((ArrayList) eh5Var.b).size() - 1) {
                    j15Var3.o.setText("");
                    break;
                }
                break;
            case 3:
                k15 k15Var = (k15) obj3;
                EditPlayerTransferDialog editPlayerTransferDialog = (EditPlayerTransferDialog) obj;
                k15Var.h.clearFocus();
                qvj qvjVar = (qvj) ((wg5) obj2).b.get(i);
                sh5 v3 = editPlayerTransferDialog.v();
                qvjVar.getClass();
                v3.n = qvjVar;
                SofaTextInputLayout sofaTextInputLayout = k15Var.c;
                sofaTextInputLayout.setHint(R.string.edit_player_transfer_date);
                SofaTextInputLayout sofaTextInputLayout2 = k15Var.d;
                sofaTextInputLayout2.setVisibility(0);
                SofaTextInputLayout sofaTextInputLayout3 = k15Var.g;
                sofaTextInputLayout3.setVisibility(0);
                ConstraintLayout constraintLayout = k15Var.f;
                constraintLayout.setVisibility(0);
                SofaTextInputLayout sofaTextInputLayout4 = k15Var.i;
                sofaTextInputLayout4.setVisibility(0);
                int ordinal = qvjVar.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 4) {
                        sofaTextInputLayout2.setVisibility(8);
                        sofaTextInputLayout3.setVisibility(8);
                        constraintLayout.setVisibility(8);
                        sofaTextInputLayout4.setVisibility(8);
                        sofaTextInputLayout.setHint(R.string.edit_player_transfer_date_default);
                    } else if (ordinal == 5) {
                        sofaTextInputLayout2.setVisibility(8);
                        sofaTextInputLayout3.setVisibility(0);
                        constraintLayout.setVisibility(8);
                        sofaTextInputLayout4.setVisibility(8);
                        sofaTextInputLayout.setHint(R.string.edit_player_transfer_date_default);
                    } else if (ordinal != 6) {
                        break;
                    } else {
                        sofaTextInputLayout3.setVisibility(8);
                        constraintLayout.setVisibility(8);
                        sofaTextInputLayout4.setVisibility(8);
                        sofaTextInputLayout.setHint(R.string.edit_player_transfer_date_default);
                    }
                    editPlayerTransferDialog.C();
                    break;
                }
                constraintLayout.setVisibility(8);
                editPlayerTransferDialog.C();
            case 4:
                EditTeamDialog editTeamDialog = (EditTeamDialog) obj3;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj2;
                l15 l15Var = (l15) obj;
                di5 B = editTeamDialog.B();
                Adapter adapter = adapterView.getAdapter();
                adapter.getClass();
                B.k((Venue) ((bi5) adapter).getItem(i));
                Venue venue = editTeamDialog.B().s;
                if (venue != null) {
                    TextInputEditText textInputEditText = l15Var.o;
                    TextInputEditText textInputEditText2 = l15Var.n;
                    textInputEditText.setEnabled(true);
                    textInputEditText2.setEnabled(true);
                    textInputEditText2.setText(venue.getStadium().getName());
                    TextInputEditText textInputEditText3 = l15Var.o;
                    Integer capacity = venue.getStadium().getCapacity();
                    textInputEditText3.setText(capacity != null ? String.valueOf(capacity.intValue()) : null);
                }
                materialAutoCompleteTextView.clearFocus();
                FragmentActivity requireActivity = editTeamDialog.requireActivity();
                requireActivity.getClass();
                View currentFocus = requireActivity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = new View(requireActivity);
                }
                EditText editText = currentFocus instanceof EditText ? (EditText) currentFocus : null;
                if (editText != null) {
                    editText.clearFocus();
                }
                Context context = currentFocus.getContext();
                context.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    break;
                }
                break;
            case 5:
                i15 i15Var = (i15) obj3;
                i15Var.f.clearFocus();
                FighterSuggestPostBody fighterSuggestPostBody = ((MmaEditFighterDialog) obj2).v().i;
                j08[] j08VarArr = (j08[]) ((eh5) obj).b;
                fighterSuggestPostBody.setFightingStyle(j08VarArr[i].a);
                if (i == j08VarArr.length - 1) {
                    i15Var.k.setText("");
                    break;
                }
                break;
            default:
                i15 i15Var2 = (i15) obj3;
                i15Var2.e.clearFocus();
                FighterSuggestPostBody fighterSuggestPostBody2 = ((MmaEditFighterDialog) obj2).v().i;
                ArrayList arrayList2 = (ArrayList) ((eh5) obj).b;
                fighterSuggestPostBody2.setNationality(((Country) arrayList2.get(i)).getIso3Alpha());
                if (i == arrayList2.size() - 1) {
                    i15Var2.h.setText("");
                    break;
                }
                break;
        }
    }
}
