package com.vk.voip.ui.settings.participants_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.l;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.acw0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.drr0;
import xsna.dzp0;
import xsna.f4m;
import xsna.f89;
import xsna.fuw0;
import xsna.fvr0;
import xsna.grr0;
import xsna.iah0;
import xsna.j5g;
import xsna.jqr0;
import xsna.lhg;
import xsna.nrl;
import xsna.o44;
import xsna.omw;
import xsna.pvr0;
import xsna.tvr0;
import xsna.wrr0;
import xsna.xim0;
import xsna.xrr0;

/* compiled from: CallParticipantsAdapter.kt */
/* loaded from: classes7.dex */
public final class a extends RecyclerView.Adapter<RecyclerView.e0> {
    public final LayoutInflater c;
    public final com.vk.movika.sdk.base.observable.a d;
    public final f89 e = new f89(this, new b());

    public a(LayoutInflater layoutInflater, com.vk.movika.sdk.base.observable.a aVar) {
        this.c = layoutInflater;
        this.d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        CallSettingsItem callSettingsItem = this.e.d.get(i);
        if (callSettingsItem instanceof CallSettingsItem.CallParticipant) {
            return 2;
        }
        if (callSettingsItem instanceof CallSettingsItem.f) {
            return 3;
        }
        if (callSettingsItem instanceof CallSettingsItem.i) {
            return 5;
        }
        if (callSettingsItem instanceof CallSettingsItem.e) {
            return 7;
        }
        if (callSettingsItem instanceof CallSettingsItem.c) {
            return 11;
        }
        if (callSettingsItem instanceof CallSettingsItem.a) {
            return 13;
        }
        if (callSettingsItem instanceof CallSettingsItem.g) {
            return 15;
        }
        if (callSettingsItem instanceof CallSettingsItem.TitleHeader) {
            return 16;
        }
        if (callSettingsItem instanceof CallSettingsItem.d) {
            return 17;
        }
        if (callSettingsItem instanceof CallSettingsItem.FillSpace) {
            return 19;
        }
        if (callSettingsItem instanceof CallSettingsItem.h) {
            return 21;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        throw new IllegalStateException("onBindViewHolder with payloads must be called first");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.c;
        if (i == 2) {
            int i2 = l.y;
            return new l((ViewGroup) layoutInflater.inflate(R.layout.voip_participants_view_item_call_participant, viewGroup, false));
        }
        if (i == 3) {
            int i3 = wrr0.r;
            return new wrr0(layoutInflater.inflate(R.layout.voip_participants_view_item_invite_user, viewGroup, false));
        }
        if (i == 5) {
            int i4 = tvr0.s;
            return new tvr0(layoutInflater.inflate(R.layout.voip_participants_view_item_waiting_room_participant, viewGroup, false));
        }
        if (i == 7) {
            int i5 = m.l;
            return new m(layoutInflater.inflate(R.layout.voip_participants_view_item_empty, viewGroup, false));
        }
        if (i == 11) {
            int i6 = o.o;
            return new o(layoutInflater.inflate(R.layout.voip_participants_view_item_contact_permission_banner, viewGroup, false));
        }
        if (i == 13) {
            int i7 = k.p;
            return new k(layoutInflater.inflate(R.layout.voip_participants_view_item_admin_toolbar, viewGroup, false));
        }
        if (i == 19) {
            int i8 = grr0.n;
            return new grr0(new View(viewGroup.getContext()));
        }
        if (i == 21) {
            int i9 = fvr0.p;
            Context context = viewGroup.getContext();
            VkSearchView vkSearchView = new VkSearchView(context, null, 6, 0);
            vkSearchView.setVoiceActionDelegate(new nrl(context, new acw0(new xim0(vkSearchView, 15)), new o44(0)));
            return new fvr0(vkSearchView);
        }
        switch (i) {
            case 15:
                int i10 = xrr0.m;
                return new xrr0(new LinearLayout(viewGroup.getContext()));
            case 16:
                int i11 = pvr0.s;
                return new pvr0(layoutInflater.inflate(R.layout.voip_participants_view_item_title_header, viewGroup, false));
            case 17:
                int i12 = drr0.n;
                return new drr0(new LinearLayout(viewGroup.getContext()));
            default:
                throw new IllegalStateException(lhg.a(i, "Illegal viewType: "));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        ((jqr0) e0Var).V5();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        super.onViewRecycled(e0Var);
        ((jqr0) e0Var).V5();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        int i2;
        int i3;
        CallSettingsItem callSettingsItem = this.e.d.get(i);
        j5g.b0(0, list);
        boolean z = e0Var instanceof fvr0;
        com.vk.movika.sdk.base.observable.a aVar = this.d;
        if (z) {
            fvr0 fvr0Var = (fvr0) e0Var;
            CallSettingsItem.h hVar = (CallSettingsItem.h) callSettingsItem;
            VkSearchView vkSearchView = fvr0Var.l;
            fvr0.a aVar2 = fvr0Var.n;
            EditText editText = fvr0Var.o;
            String str = hVar.a;
            if (str == null) {
                dzp0.a(editText, "", aVar2);
                vkSearchView.d0();
            } else {
                dzp0.a(editText, str, aVar2);
            }
            vkSearchView.X4(hVar.b);
            fvr0Var.m = aVar;
            return;
        }
        if (e0Var instanceof l) {
            l lVar = (l) e0Var;
            CallSettingsItem.CallParticipant callParticipant = (CallSettingsItem.CallParticipant) callSettingsItem;
            lVar.w = callParticipant;
            lVar.x = aVar;
            lVar.l.O(callParticipant.b);
            lVar.n.setText(callParticipant.d);
            CallSettingsItem.CallParticipant.b bVar = callParticipant.c;
            ImageView imageView = lVar.m;
            if (bVar instanceof CallSettingsItem.CallParticipant.b.C2087b) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.vk_icon_star_circle_fill_blue_16);
            } else if (bVar instanceof CallSettingsItem.CallParticipant.b.a) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_star_circle_fill_gray_16);
            } else {
                if (!(bVar instanceof CallSettingsItem.CallParticipant.b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(imageView);
            }
            bwt0.p0(lVar.o, callParticipant.e);
            CallSettingsItem.CallParticipant.a aVar3 = callParticipant.f;
            ImageView imageView2 = lVar.p;
            if (aVar3 instanceof CallSettingsItem.CallParticipant.a.C2086a) {
                imageView2.setVisibility(0);
                imageView2.setImageResource(R.drawable.vk_icon_pin_dot_16);
            } else if (aVar3 instanceof CallSettingsItem.CallParticipant.a.b) {
                imageView2.setVisibility(0);
                imageView2.setImageResource(R.drawable.vk_icon_pin_16);
            } else {
                if (!(aVar3 instanceof CallSettingsItem.CallParticipant.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4m.j(imageView2);
            }
            bwt0.p0(lVar.q, callParticipant.g);
            bwt0.p0(lVar.r, callParticipant.i);
            CallSettingsItem.CallParticipant.CameraState cameraState = callParticipant.j;
            ImageView imageView3 = lVar.s;
            int i4 = l.a.$EnumSwitchMapping$0[cameraState.ordinal()];
            if (i4 == 1) {
                omw.d(imageView3, R.drawable.vk_icon_cam_slash_16, R.attr.vk_ui_icon_negative);
            } else if (i4 == 2) {
                omw.d(imageView3, R.drawable.vk_icon_cam_slash_16, R.attr.vk_ui_icon_secondary);
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                omw.d(imageView3, R.drawable.vk_icon_videocam_16, R.attr.vk_ui_icon_secondary);
            }
            CallSettingsItem.CallParticipant.MicrophoneState microphoneState = callParticipant.k;
            ImageView imageView4 = lVar.t;
            int i5 = l.a.$EnumSwitchMapping$1[microphoneState.ordinal()];
            if (i5 == 1) {
                omw.d(imageView4, R.drawable.vk_icon_microphone_slash_16, R.attr.vk_ui_icon_negative);
            } else if (i5 == 2) {
                omw.d(imageView4, R.drawable.vk_icon_microphone_slash_16, R.attr.vk_ui_icon_secondary);
            } else if (i5 == 3) {
                omw.d(imageView4, R.drawable.vk_icon_microphone_16, R.attr.vk_ui_icon_secondary);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                omw.d(imageView4, R.drawable.vk_icon_microphone_16, R.attr.vk_ui_icon_positive);
            }
            bwt0.p0(lVar.u, callParticipant.l);
            bwt0.d0(lVar.v, !callParticipant.m);
            return;
        }
        if (e0Var instanceof wrr0) {
            wrr0 wrr0Var = (wrr0) e0Var;
            CallSettingsItem.f fVar = (CallSettingsItem.f) callSettingsItem;
            wrr0Var.l = fVar;
            wrr0Var.m = aVar;
            wrr0Var.n.O(fVar.i());
            wrr0Var.o.setText(fVar.getName());
            wrr0Var.q.setChecked(fVar.b);
            fuw0 fuw0Var = wrr0Var.p;
            View view = wrr0Var.itemView;
            CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background = fVar.e;
            fuw0Var.getClass();
            fuw0.a(view, callSettingsItem$ChangeBackground$Background);
            return;
        }
        if (e0Var instanceof tvr0) {
            tvr0 tvr0Var = (tvr0) e0Var;
            CallSettingsItem.i iVar = (CallSettingsItem.i) callSettingsItem;
            tvr0Var.l = iVar;
            tvr0Var.m = aVar;
            tvr0Var.n.O(iVar.i());
            tvr0Var.o.setText(iVar.getName());
            fuw0 fuw0Var2 = tvr0Var.p;
            View view2 = tvr0Var.itemView;
            CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background2 = iVar.d;
            fuw0Var2.getClass();
            fuw0.a(view2, callSettingsItem$ChangeBackground$Background2);
            return;
        }
        if (e0Var instanceof m) {
            return;
        }
        if (e0Var instanceof o) {
            o oVar = (o) e0Var;
            oVar.n = aVar;
            fuw0 fuw0Var3 = oVar.l;
            View view3 = oVar.itemView;
            CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background3 = ((CallSettingsItem.c) callSettingsItem).a;
            fuw0Var3.getClass();
            fuw0.a(view3, callSettingsItem$ChangeBackground$Background3);
            return;
        }
        if (e0Var instanceof k) {
            ((k) e0Var).l = aVar;
            return;
        }
        if (e0Var instanceof xrr0) {
            xrr0 xrr0Var = (xrr0) e0Var;
            fuw0 fuw0Var4 = xrr0Var.l;
            View view4 = xrr0Var.itemView;
            CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background4 = ((CallSettingsItem.g) callSettingsItem).a;
            fuw0Var4.getClass();
            fuw0.a(view4, callSettingsItem$ChangeBackground$Background4);
            return;
        }
        if (e0Var instanceof drr0) {
            drr0 drr0Var = (drr0) e0Var;
            CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background5 = ((CallSettingsItem.d) callSettingsItem).a;
            int i6 = drr0.a.$EnumSwitchMapping$0[callSettingsItem$ChangeBackground$Background5.ordinal()];
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                i3 = R.attr.vk_ui_separator_primary_alpha;
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.attr.vk_ui_separator_primary;
            }
            drr0Var.m.setBackgroundColor(dhr0.t.c(i3));
            fuw0 fuw0Var5 = drr0Var.l;
            View view5 = drr0Var.itemView;
            fuw0Var5.getClass();
            fuw0.a(view5, callSettingsItem$ChangeBackground$Background5);
            return;
        }
        if (!(e0Var instanceof pvr0)) {
            if (e0Var instanceof grr0) {
                grr0 grr0Var = (grr0) e0Var;
                CallSettingsItem.FillSpace fillSpace = (CallSettingsItem.FillSpace) callSettingsItem;
                View view6 = grr0Var.itemView;
                ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                if (grr0.a.$EnumSwitchMapping$0[fillSpace.a.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                layoutParams.height = iah0.a(8);
                view6.setLayoutParams(layoutParams);
                fuw0 fuw0Var6 = grr0Var.m;
                View view7 = grr0Var.itemView;
                CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background6 = fillSpace.b;
                fuw0Var6.getClass();
                fuw0.a(view7, callSettingsItem$ChangeBackground$Background6);
                return;
            }
            return;
        }
        pvr0 pvr0Var = (pvr0) e0Var;
        CallSettingsItem.TitleHeader titleHeader = (CallSettingsItem.TitleHeader) callSettingsItem;
        TextView textView = pvr0Var.q;
        TextView textView2 = pvr0Var.p;
        int i7 = pvr0.a.$EnumSwitchMapping$0[titleHeader.a.ordinal()];
        if (i7 == 1) {
            i2 = R.string.voip_invite_to_call_waiting_room;
        } else if (i7 == 2) {
            i2 = R.string.voip_chat_participants;
        } else if (i7 == 3) {
            i2 = R.string.voip_invite_to_call_from_friends;
        } else if (i7 == 4) {
            i2 = R.string.voip_invite_to_call_from_group;
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.voip_invite_to_call_phonebook_contacts_title;
        }
        pvr0Var.o.setText(i2);
        CallSettingsItem.TitleHeader.Subtitle subtitle = titleHeader.b;
        int i8 = subtitle == null ? -1 : pvr0.a.$EnumSwitchMapping$1[subtitle.ordinal()];
        Integer valueOf = i8 != 1 ? i8 != 2 ? null : Integer.valueOf(R.string.voip_invite_to_call_phonebook_contacts_subtitle) : Integer.valueOf(R.string.voip_participants_show_last_messages_subtitle);
        bwt0.p0(textView2, valueOf != null);
        if (valueOf != null) {
            textView2.setText(valueOf.intValue());
        }
        Integer num = titleHeader.c;
        bwt0.p0(textView, num != null);
        if (num != null) {
            textView.setText(String.valueOf(num.intValue()));
        }
        bwt0.p0(pvr0Var.r, titleHeader.d != null);
        fuw0 fuw0Var7 = pvr0Var.l;
        View view8 = pvr0Var.itemView;
        CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background7 = titleHeader.e;
        fuw0Var7.getClass();
        fuw0.a(view8, callSettingsItem$ChangeBackground$Background7);
        pvr0Var.m = titleHeader;
        pvr0Var.n = aVar;
    }
}
