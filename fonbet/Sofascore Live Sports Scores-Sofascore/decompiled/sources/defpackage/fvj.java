package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.slider.RangeSlider;
import com.sofascore.model.Country;
import com.sofascore.model.PlayerTransferFilterData;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.dialog.TransferFilterModal;
import com.sofascore.results.transfers.PlayerTransfersActivity;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fvj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferFilterModal b;

    public /* synthetic */ fvj(TransferFilterModal transferFilterModal, int i) {
        this.a = i;
        this.b = transferFilterModal;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TransferFilterModal transferFilterModal = this.b;
        switch (i) {
            case 0:
                js2 js2Var = transferFilterModal.x;
                if (js2Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((AutoCompleteTextView) js2Var.f).getText().clear();
                transferFilterModal.z = null;
                js2 js2Var2 = transferFilterModal.x;
                if (js2Var2 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((AutoCompleteTextView) js2Var2.m).getText().clear();
                transferFilterModal.A = null;
                transferFilterModal.G(false);
                js2 js2Var3 = transferFilterModal.x;
                if (js2Var3 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((RangeSlider) js2Var3.j).setValues(b.e(Float.valueOf(15.0f), Float.valueOf(50.0f)));
                js2 js2Var4 = transferFilterModal.x;
                if (js2Var4 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((TypeHeaderView) js2Var4.b).setSelectedIndex(0);
                js2 js2Var5 = transferFilterModal.x;
                if (js2Var5 != null) {
                    ((TypeHeaderView) js2Var5.h).setSelectedIndex(0);
                    return;
                } else {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
            case 1:
                PlayerTransferFilterData playerTransferFilterData = new PlayerTransferFilterData((Country) null, (UniqueTournament) null, 0, 0, (PlayerTransferFilterData.FollowerCountSelection) null, (PlayerTransferFilterData.PlayerPositionSelection) null, (PlayerTransferFilterData.IncomingOutgoingSelection) null, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (DefaultConstructorMarker) null);
                playerTransferFilterData.setCountry(transferFilterModal.z);
                playerTransferFilterData.setTournament(transferFilterModal.A);
                js2 js2Var6 = transferFilterModal.x;
                if (js2Var6 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                String selectedItem = ((TypeHeaderView) js2Var6.e).getSelectedItem();
                if (selectedItem == null) {
                    selectedItem = "ALL";
                }
                playerTransferFilterData.setIncomingOutgoing(PlayerTransferFilterData.IncomingOutgoingSelection.valueOf(selectedItem));
                js2 js2Var7 = transferFilterModal.x;
                if (js2Var7 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                playerTransferFilterData.setAgeFrom((int) ((RangeSlider) js2Var7.j).getValues().get(0).floatValue());
                js2 js2Var8 = transferFilterModal.x;
                if (js2Var8 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                playerTransferFilterData.setAgeTo((int) ((RangeSlider) js2Var8.j).getValues().get(1).floatValue());
                js2 js2Var9 = transferFilterModal.x;
                if (js2Var9 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                String selectedItem2 = ((TypeHeaderView) js2Var9.b).getSelectedItem();
                if (selectedItem2 == null) {
                    selectedItem2 = "F0";
                }
                playerTransferFilterData.setMinFollowers(PlayerTransferFilterData.FollowerCountSelection.valueOf(selectedItem2));
                js2 js2Var10 = transferFilterModal.x;
                if (js2Var10 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                String selectedItem3 = ((TypeHeaderView) js2Var10.h).getSelectedItem();
                playerTransferFilterData.setPosition(PlayerTransferFilterData.PlayerPositionSelection.valueOf(selectedItem3 != null ? selectedItem3 : "ALL"));
                Context requireContext = transferFilterModal.requireContext();
                requireContext.getClass();
                n9e.u(requireContext, new qdj(playerTransferFilterData, 7));
                kr9 kr9Var = transferFilterModal.B;
                if (kr9Var == null) {
                    Intrinsics.i("callback");
                    throw null;
                }
                PlayerTransfersActivity playerTransfersActivity = (PlayerTransfersActivity) kr9Var.b;
                int i2 = PlayerTransfersActivity.R;
                playerTransfersActivity.Q(playerTransferFilterData);
                transferFilterModal.j();
                return;
            case 2:
                js2 js2Var11 = transferFilterModal.x;
                if (js2Var11 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((AutoCompleteTextView) js2Var11.f).clearFocus();
                js2 js2Var12 = transferFilterModal.x;
                if (js2Var12 != null) {
                    ((AutoCompleteTextView) js2Var12.m).clearFocus();
                    return;
                } else {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
            case 3:
                transferFilterModal.z = null;
                js2 js2Var13 = transferFilterModal.x;
                if (js2Var13 != null) {
                    ((AutoCompleteTextView) js2Var13.f).setText("");
                    return;
                } else {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
            default:
                transferFilterModal.A = null;
                js2 js2Var14 = transferFilterModal.x;
                if (js2Var14 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                ((AutoCompleteTextView) js2Var14.m).setText("");
                transferFilterModal.G(false);
                return;
        }
    }
}
