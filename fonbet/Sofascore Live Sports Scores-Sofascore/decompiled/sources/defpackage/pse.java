package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Batsman;
import com.sofascore.model.mvvm.model.Partnership;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.player.PlayerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pse extends z6 {
    public e92 f;
    public nfc g;
    public nfc h;
    public nfc i;

    public final void c() {
        this.f = e92.i(a());
        e92 e92Var = this.f;
        if (e92Var == null) {
            Intrinsics.i("layoutBinding");
            throw null;
        }
        this.d = new PopupWindow((FrameLayout) e92Var.b, -2, -2);
        e92 e92Var2 = this.f;
        if (e92Var2 == null) {
            Intrinsics.i("layoutBinding");
            throw null;
        }
        ((LinearLayout) e92Var2.c).setBackgroundResource(R.drawable.menu_background_surface);
        e92 e92Var3 = this.f;
        if (e92Var3 == null) {
            Intrinsics.i("layoutBinding");
            throw null;
        }
        ((LinearLayout) e92Var3.c).setElevation(this.c);
        e92 e92Var4 = this.f;
        if (e92Var4 == null) {
            Intrinsics.i("layoutBinding");
            throw null;
        }
        this.g = (nfc) e92Var4.e;
        if (e92Var4 == null) {
            Intrinsics.i("layoutBinding");
            throw null;
        }
        this.h = (nfc) e92Var4.f;
        if (e92Var4 != null) {
            this.i = (nfc) e92Var4.d;
        } else {
            Intrinsics.i("layoutBinding");
            throw null;
        }
    }

    public final void d(View view, Object obj) {
        Integer wicketTypeId;
        c();
        String str = null;
        if (obj instanceof fae) {
            nfc nfcVar = this.g;
            if (nfcVar == null) {
                Intrinsics.i("player1Binding");
                throw null;
            }
            Partnership partnership = ((fae) obj).b;
            f(nfcVar, tba.t(partnership.getPlayer1()), new lse(this, obj, 0));
            nfc nfcVar2 = this.h;
            if (nfcVar2 == null) {
                Intrinsics.i("player2Binding");
                throw null;
            }
            f(nfcVar2, tba.t(partnership.getPlayer2()), new lse(this, obj, 1));
        } else if (obj instanceof lt1) {
            Batsman batsman = ((lt1) obj).c;
            if (batsman.getWicketCatch() == null && batsman.getWicketBowler() == null) {
                int i = PlayerActivity.Z;
                jle.q(this.a, batsman.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return;
            }
            nfc nfcVar3 = this.g;
            if (nfcVar3 == null) {
                Intrinsics.i("player1Binding");
                throw null;
            }
            String playerName = batsman.getPlayerName();
            if (playerName == null) {
                playerName = tba.t(batsman.getPlayer());
            }
            f(nfcVar3, playerName, new lse(this, obj, 2));
            Player wicketCatch = batsman.getWicketCatch();
            int i2 = 6;
            if (wicketCatch != null) {
                nfc nfcVar4 = this.h;
                if (nfcVar4 == null) {
                    Intrinsics.i("player2Binding");
                    throw null;
                }
                String wicketCatchName = batsman.getWicketCatchName();
                if (wicketCatchName == null) {
                    wicketCatchName = tba.t(wicketCatch);
                }
                f(nfcVar4, wicketCatchName, new zbe(i2, this, wicketCatch));
            }
            if (batsman.getWicketBowler() != null && ((wicketTypeId = batsman.getWicketTypeId()) == null || wicketTypeId.intValue() != 6)) {
                nfc nfcVar5 = this.i;
                if (nfcVar5 == null) {
                    Intrinsics.i("player3Binding");
                    throw null;
                }
                String wicketBowlerName = batsman.getWicketBowlerName();
                if (wicketBowlerName == null) {
                    Player wicketBowler = batsman.getWicketBowler();
                    if (wicketBowler != null) {
                        str = tba.t(wicketBowler);
                    }
                } else {
                    str = wicketBowlerName;
                }
                f(nfcVar5, str, new lse(obj, this));
            }
        }
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            b(view, popupWindow);
        }
    }

    public final void e(View view, final Player player, final Player player2, final Player player3, final Function1 function1) {
        c();
        if (player != null) {
            nfc nfcVar = this.g;
            if (nfcVar == null) {
                Intrinsics.i("player1Binding");
                throw null;
            }
            final int i = 0;
            f(nfcVar, tba.t(player), new Function0() { // from class: ose
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    Player player4 = player;
                    Function1 function12 = function1;
                    switch (i2) {
                        case 0:
                            function12.invoke(player4);
                            break;
                        case 1:
                            function12.invoke(player4);
                            break;
                        default:
                            function12.invoke(player4);
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        if (player2 != null) {
            nfc nfcVar2 = this.h;
            if (nfcVar2 == null) {
                Intrinsics.i("player2Binding");
                throw null;
            }
            final int i2 = 1;
            f(nfcVar2, tba.t(player2), new Function0() { // from class: ose
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    Player player4 = player2;
                    Function1 function12 = function1;
                    switch (i22) {
                        case 0:
                            function12.invoke(player4);
                            break;
                        case 1:
                            function12.invoke(player4);
                            break;
                        default:
                            function12.invoke(player4);
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        if (player3 != null) {
            nfc nfcVar3 = this.i;
            if (nfcVar3 == null) {
                Intrinsics.i("player3Binding");
                throw null;
            }
            final int i3 = 2;
            f(nfcVar3, tba.t(player3), new Function0() { // from class: ose
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i3;
                    Player player4 = player3;
                    Function1 function12 = function1;
                    switch (i22) {
                        case 0:
                            function12.invoke(player4);
                            break;
                        case 1:
                            function12.invoke(player4);
                            break;
                        default:
                            function12.invoke(player4);
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            b(view, popupWindow);
        }
    }

    public final void f(nfc nfcVar, String str, Function0 function0) {
        ConstraintLayout constraintLayout = nfcVar.a;
        constraintLayout.getClass();
        constraintLayout.setVisibility(0);
        TextView textView = nfcVar.c;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        nfcVar.a.setOnClickListener(new eyd(8, function0, this));
    }
}
