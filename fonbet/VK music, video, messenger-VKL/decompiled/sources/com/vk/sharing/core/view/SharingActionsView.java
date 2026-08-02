package com.vk.sharing.core.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Objects;
import xsna.b25;
import xsna.e43;
import xsna.fpf0;
import xsna.k7m;
import xsna.lhg;
import xsna.m33;
import xsna.m7m;
import xsna.nlf0;
import xsna.o25;
import xsna.qfq;
import xsna.xhr0;
import xsna.ybj0;
import xsna.ze6;

/* loaded from: classes5.dex */
public final class SharingActionsView extends HorizontalScrollView {
    public final a b;
    public b c;
    public final LinearLayout d;
    public final int e;
    public boolean f;
    public final AccountTypeForSharing g;

    @Nullable
    public ybj0 h;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SharingActionsView sharingActionsView = SharingActionsView.this;
            if (sharingActionsView.c != null) {
                ybj0 ybj0Var = (ybj0) view;
                if (ybj0Var.isEnabled()) {
                    b bVar = sharingActionsView.c;
                    int i = ybj0Var.c;
                    f fVar = (f) ((nlf0) bVar).c;
                    ze6 ze6Var = fVar.f1;
                    if (ze6Var == null) {
                        l.a aVar = fVar.D;
                        if (aVar != null) {
                            aVar.H2(i);
                            return;
                        }
                        return;
                    }
                    switch (i) {
                        case 1:
                            ze6Var.d(IntentAction.SHARE_TO_WALL);
                            return;
                        case 2:
                        case 7:
                        default:
                            throw new UnsupportedOperationException(lhg.a(i, "Unsupported item "));
                        case 3:
                            ze6Var.d(IntentAction.SHARE_IN_STORY);
                            return;
                        case 4:
                            ze6Var.d(IntentAction.COPY_LINK);
                            return;
                        case 5:
                            ze6Var.d(IntentAction.SHARE_EXTERNAL);
                            return;
                        case 6:
                            ze6Var.d(IntentAction.MAKE_DUET);
                            return;
                        case 8:
                            ze6Var.d(IntentAction.SHARE_TO_ALBUM);
                            return;
                        case 9:
                            ze6Var.d(IntentAction.SHARE_TO_DOCS);
                            return;
                        case 10:
                            ze6Var.d(IntentAction.ADD_TO_MY_VIDEOS);
                            return;
                        case 11:
                            ze6Var.d(IntentAction.ADD_FAVE);
                            return;
                        case 12:
                            ze6Var.d(IntentAction.REMOVE_FAVE);
                            return;
                    }
                }
            }
        }
    }

    public interface b {
    }

    public SharingActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new a();
        this.f = false;
        AccountTypeForSharing.Companion.getClass();
        b25 s = ((BridgeComponent) ((k7m) m7m.f(new com.vk.sharing.core.view.a())).a(fpf0.a(BridgeComponent.class))).s();
        this.g = o25.b(s) ? AccountTypeForSharing.EDU_ACCOUNT_IN_ME : o25.c(s) ? AccountTypeForSharing.VK_ACCOUNT_IN_ME : AccountTypeForSharing.VK_ACCOUNT;
        this.e = (int) getResources().getDimension(R.dimen.sharing_actions_width);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.d = linearLayout;
        addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
    }

    private int getTextResId() {
        AccountTypeForSharing accountTypeForSharing = AccountTypeForSharing.VK_ACCOUNT_IN_ME;
        AccountTypeForSharing accountTypeForSharing2 = this.g;
        return accountTypeForSharing2 == accountTypeForSharing ? R.string.sharing_action_button_label2_me_community : accountTypeForSharing2 == AccountTypeForSharing.EDU_ACCOUNT_IN_ME ? R.string.sharing_action_button_label2_me : R.string.sharing_action_button_label2;
    }

    public final ybj0 a(int i, int i2, int i3, boolean z) {
        Context context = getContext();
        String string = context.getString(i3);
        ybj0 ybj0Var = new ybj0(context, i, m33.a(i2, context), string, this.f, z);
        ybj0Var.setOnClickListener(this.b);
        ybj0Var.setContentDescription(string);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(ybj0Var, new FrameLayout.LayoutParams(-2, -2, 1));
        this.d.addView(frameLayout, new LinearLayout.LayoutParams(this.e, -2));
        return ybj0Var;
    }

    public final void b(@NonNull ActionsInfo actionsInfo, int i) {
        this.d.removeAllViews();
        int i2 = actionsInfo.b;
        if ((i2 & 4) > 0) {
            a(3, R.drawable.ic_story_outline_gradient_28, R.string.sharing_action_button_label_story, false);
        }
        if ((262144 & i2) > 0) {
            a(16, R.drawable.vk_icon_radiowaves_left_and_right_outline_28, R.string.sharing_action_button_label_broadcast, false);
        }
        if ((i2 & 1) > 0) {
            a(1, R.drawable.vk_icon_arrow_uturn_right_outline_28, R.string.sharing_action_button_label1, false);
        }
        if ((i2 & 2) > 0) {
            a(2, R.drawable.vk_icon_users_outline_28, getTextResId(), false);
        }
        if ((i2 & 256) > 0) {
            a(8, R.drawable.vk_icon_picture_outline_28, R.string.share_to_album, false);
        }
        if ((i2 & 512) > 0) {
            a(9, R.drawable.vk_icon_document_outline_28, R.string.share_to_docs, false);
        }
        if ((i2 & 1024) > 0) {
            a(10, R.drawable.vk_icon_videocam_outline_28, R.string.share_to_videos, false);
        }
        if ((i == 30 || i == 31) && (i2 & 8) > 0) {
            a(4, R.drawable.vk_icon_copy_outline_28, R.string.sharing_action_button_label3, false);
        }
        if ((i2 & 32) > 0) {
            if (i == 30 && !actionsInfo.h) {
                this.h = a(11, R.drawable.vk_icon_clock_outline_28, R.string.video_watch_later, false);
            } else if (i == 30 && actionsInfo.h) {
                this.h = a(12, R.drawable.vk_icon_done_outline_28, R.string.video_watch_later, false);
            } else {
                boolean z = actionsInfo.h;
                if (!z) {
                    this.h = a(11, R.drawable.vk_icon_favorite_outline_28, R.string.add_to_fave, false);
                } else if (z) {
                    this.h = a(12, R.drawable.vk_icon_favorite_28, R.string.remove_from_fave, false);
                }
            }
        }
        if (i != 30 && i != 31 && (i2 & 8) > 0) {
            a(4, R.drawable.vk_icon_copy_outline_28, R.string.sharing_action_button_label3, false);
        }
        if ((i2 & 16) > 0) {
            a(5, R.drawable.vk_icon_share_external_outline_28, R.string.sharing_action_button_label4_new, false);
        }
        if ((i2 & 64) > 0) {
            a(6, R.drawable.vk_icon_smiles_2_outline_28, R.string.sharing_action_button_label_clip_duet, false);
        }
        if ((1048576 & i2) > 0) {
            String a2 = qfq.a.C3560a.a(i);
            if (xhr0.b(e43.a, "ru.oneme.app")) {
                a(18, R.drawable.vk_icon_logo_max_circle_color_28, R.string.sharing_external_app_max, false);
            } else if (!TextUtils.isEmpty(a2)) {
                a(18, R.drawable.vk_icon_logo_max_circle_color_28, R.string.sharing_external_app_max, false);
            }
        }
        if ((i2 & 2048) > 0) {
            a(13, R.drawable.vk_icon_download_outline_28, R.string.sharing_action_button_download, false);
        }
        if ((65536 & i2) > 0 && xhr0.b(e43.a, "com.whatsapp")) {
            a(15, R.drawable.vk_icon_logo_whatsapp_color_28, R.string.sharing_external_app_whatsapp, false);
        }
        if ((32768 & i2) > 0 && xhr0.b(e43.a, "org.telegram.messenger")) {
            a(14, R.drawable.vk_icon_logo_telegram_color_28, R.string.sharing_external_app_telegram, false);
        } else {
            if ((524288 & i2) <= 0 || !xhr0.b(e43.a, "org.telegram.messenger.web")) {
                return;
            }
            a(17, R.drawable.vk_icon_logo_telegram_color_28, R.string.sharing_external_app_telegram, false);
        }
    }

    public final void c(@NonNull ActionsInfo actionsInfo, int i) {
        this.d.removeAllViews();
        Iterator<Integer> it = actionsInfo.d.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            boolean equals = Objects.equals(actionsInfo.i, next);
            switch (next.intValue()) {
                case 1:
                    a(1, R.drawable.vk_icon_arrow_uturn_right_outline_28, R.string.sharing_action_button_label1, false);
                    break;
                case 2:
                    a(2, R.drawable.vk_icon_users_outline_28, R.string.sharing_action_button_label2, false);
                    break;
                case 3:
                    a(3, R.drawable.ic_story_outline_gradient_28, R.string.sharing_action_button_label_story, equals);
                    break;
                case 4:
                    a(4, R.drawable.vk_icon_copy_outline_28, R.string.sharing_action_button_label3, false);
                    break;
                case 5:
                    a(5, R.drawable.vk_icon_share_external_outline_28, R.string.sharing_action_button_label4_new, false);
                    break;
                case 6:
                    a(6, R.drawable.vk_icon_smiles_2_outline_28, R.string.sharing_action_button_label_clip_duet, false);
                    break;
                case 8:
                    a(8, R.drawable.vk_icon_picture_outline_28, R.string.share_to_album, false);
                    break;
                case 9:
                    a(9, R.drawable.vk_icon_document_outline_28, R.string.share_to_docs, false);
                    break;
                case 11:
                case 12:
                    if (i == 30 && !actionsInfo.h) {
                        this.h = a(11, R.drawable.vk_icon_clock_outline_28, R.string.video_watch_later, false);
                        break;
                    } else if (i != 30 || !actionsInfo.h) {
                        if (!actionsInfo.h) {
                            this.h = a(11, R.drawable.vk_icon_favorite_outline_28, R.string.add_to_fave, false);
                            break;
                        } else {
                            this.h = a(12, R.drawable.vk_icon_favorite_28, R.string.remove_from_fave, false);
                            break;
                        }
                    } else {
                        this.h = a(12, R.drawable.vk_icon_done_outline_28, R.string.video_watch_later, false);
                        break;
                    }
                case 13:
                    a(13, R.drawable.vk_icon_download_outline_28, R.string.sharing_action_button_download, false);
                    break;
                case 14:
                    if (!xhr0.b(e43.a, "org.telegram.messenger")) {
                        break;
                    } else {
                        a(14, R.drawable.vk_icon_logo_telegram_color_28, R.string.sharing_external_app_telegram, false);
                        break;
                    }
                case 15:
                    if (!xhr0.b(e43.a, "com.whatsapp")) {
                        break;
                    } else {
                        a(15, R.drawable.vk_icon_logo_whatsapp_color_28, R.string.sharing_external_app_whatsapp, false);
                        break;
                    }
                case 16:
                    a(16, R.drawable.vk_icon_radiowaves_left_and_right_outline_28, R.string.sharing_action_button_label_broadcast, false);
                    break;
                case 17:
                    if (!xhr0.b(e43.a, "org.telegram.messenger") && xhr0.b(e43.a, "org.telegram.messenger.web")) {
                        a(17, R.drawable.vk_icon_logo_telegram_color_28, R.string.sharing_external_app_telegram, false);
                        break;
                    }
                    break;
                case 18:
                    int i2 = BuildInfo.q() ? R.string.sharing_external_app_max : R.string.share_to_max;
                    String a2 = qfq.a.C3560a.a(i);
                    if (!xhr0.b(e43.a, "ru.oneme.app")) {
                        if (!TextUtils.isEmpty(a2)) {
                            a(18, R.drawable.vk_icon_logo_max_circle_color_28, i2, false);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        a(18, R.drawable.vk_icon_logo_max_circle_color_28, i2, false);
                        break;
                    }
            }
        }
    }

    public void setListener(@Nullable b bVar) {
        this.c = bVar;
    }

    public void setRedesignEnabled(boolean z) {
        this.f = z;
    }

    public void setToggleFaveActionIsEnabled(boolean z) {
        ybj0 ybj0Var = this.h;
        if (ybj0Var != null) {
            ybj0Var.setEnabled(z);
        }
    }
}
