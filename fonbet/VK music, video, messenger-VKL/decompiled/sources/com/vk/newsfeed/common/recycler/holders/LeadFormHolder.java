package com.vk.newsfeed.common.recycler.holders;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.dto.common.ImageSize;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import io.reactivex.rxjava3.internal.operators.single.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.atv0;
import xsna.dvq0;
import xsna.e43;
import xsna.gd60;
import xsna.h170;
import xsna.hd60;
import xsna.hg1;
import xsna.iyy;
import xsna.izs;
import xsna.j4x;
import xsna.nv2;
import xsna.ov2;
import xsna.pv2;
import xsna.ryy;
import xsna.s3q0;
import xsna.syy;
import xsna.tyy;
import xsna.w6w;
import xsna.wf0;
import xsna.zrp;

/* compiled from: LeadFormHolder.kt */
/* loaded from: classes4.dex */
public final class LeadFormHolder extends wf0 {
    public static final /* synthetic */ int K = 0;
    public final tyy E;
    public final RecyclerView F;
    public final iyy G;
    public final syy H;
    public int I;
    public boolean J;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeadFormHolder.kt */
    public static final class ButtonAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        public static final ButtonAction NEXT_PAGE;
        public static final ButtonAction OPEN_SITE;
        public static final ButtonAction SEND_DATA;

        static {
            ButtonAction buttonAction = new ButtonAction("NEXT_PAGE", 0);
            NEXT_PAGE = buttonAction;
            ButtonAction buttonAction2 = new ButtonAction("SEND_DATA", 1);
            SEND_DATA = buttonAction2;
            ButtonAction buttonAction3 = new ButtonAction("OPEN_SITE", 2);
            OPEN_SITE = buttonAction3;
            ButtonAction[] buttonActionArr = {buttonAction, buttonAction2, buttonAction3};
            $VALUES = buttonActionArr;
            $ENTRIES = new asp(buttonActionArr);
        }

        public ButtonAction() {
            throw null;
        }

        public static ButtonAction valueOf(String str) {
            return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
        }

        public static ButtonAction[] values() {
            return (ButtonAction[]) $VALUES.clone();
        }
    }

    /* compiled from: LeadFormHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.NEXT_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.SEND_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonAction.OPEN_SITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LeadFormHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<ButtonAction, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ButtonAction buttonAction) {
            ShitAttachment.LeadForm leadForm;
            ButtonAction buttonAction2 = buttonAction;
            LeadFormHolder leadFormHolder = (LeadFormHolder) this.receiver;
            int i = LeadFormHolder.K;
            ShitAttachment q6 = leadFormHolder.q6();
            if (q6 != null && (leadForm = q6.Y) != null) {
                int i2 = a.$EnumSwitchMapping$0[buttonAction2.ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    int i4 = 2;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        leadFormHolder.U6();
                        gd60 a = hd60.a();
                        Context context = leadFormHolder.itemView.getContext();
                        ShitAttachment.LeadForm.ResultInfo resultInfo = leadForm.i;
                        gd60.Q0(a, context, resultInfo.d, resultInfo.e, null, null, 24);
                    } else if (!leadFormHolder.J) {
                        leadFormHolder.U6();
                        leadFormHolder.J = true;
                        hg1.b(leadFormHolder.itemView, new k(leadFormHolder.E.n(leadForm.c, leadForm.b), new w6w(leadFormHolder, i3)).subscribe(new ov2(new nv2(23, leadFormHolder, leadForm), 27), new pv2(new j4x(leadFormHolder, i4), 24)));
                    }
                } else {
                    leadFormHolder.W6(leadForm);
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LeadFormHolder(ViewGroup viewGroup, h170 h170Var, dvq0 dvq0Var, ExtendedProfilesRepository extendedProfilesRepository, tyy tyyVar) {
        super(R.layout.ads_lead_form, viewGroup);
        float f;
        float f2;
        float f3;
        this.E = tyyVar;
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.itemView.findViewById(R.id.ratio_layout);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler_view);
        this.F = recyclerView;
        iyy iyyVar = new iyy(tyyVar, extendedProfilesRepository, dvq0Var, new b(1, this, LeadFormHolder.class, "onButtonClick", "onButtonClick(Lcom/vk/newsfeed/common/recycler/holders/LeadFormHolder$ButtonAction;)V", 0));
        this.G = iyyVar;
        this.H = new syy();
        float f4 = this.itemView.getContext().getResources().getConfiguration().fontScale;
        float f5 = 1.2f;
        if (f4 != 1.0f) {
            f = 1.15f;
            if (f4 <= 1.15f) {
                f = 1.05f;
            } else if (f4 > 1.3f) {
                if (f4 <= 1.5f) {
                    f = 1.2f;
                } else if (f4 <= 1.8f) {
                    f = 1.25f;
                } else if (f4 <= 2.0f) {
                    f = 1.3f;
                }
            }
            f2 = this.itemView.getResources().getConfiguration().smallestScreenWidthDp;
            if (f2 > 320.0f) {
                f5 = 1.4f;
            } else if (f2 <= 340.0f) {
                f5 = 1.3f;
            } else if (f2 > 360.0f) {
                f5 = f2 <= 380.0f ? 1.1f : f2 <= 400.0f ? 1.05f : 1.0f;
            }
            f3 = f * f5;
            if (f3 <= 1.0f) {
                ratioFrameLayout.setRatio(f3 * 1.1f);
            } else {
                ratioFrameLayout.setRatio(f3);
            }
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LeadFormHolder$1$1(0, false));
            recyclerView.setAdapter(iyyVar);
        }
        f = 1.0f;
        f2 = this.itemView.getResources().getConfiguration().smallestScreenWidthDp;
        if (f2 > 320.0f) {
        }
        f3 = f * f5;
        if (f3 <= 1.0f) {
        }
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LeadFormHolder$1$1(0, false));
        recyclerView.setAdapter(iyyVar);
    }

    @Override // xsna.qi6
    public final void E6(ShitAttachment shitAttachment) {
        ShitAttachment.LeadForm leadForm = shitAttachment.Y;
        if (leadForm != null) {
            String str = leadForm.c;
            this.F.scrollToPosition(this.E.j(str));
            this.H.getClass();
            List<ShitAttachment.LeadForm.ContactField> list = leadForm.g;
            ArrayList arrayList = new ArrayList();
            ShitAttachment.LeadForm.MainImage mainImage = leadForm.h;
            arrayList.add(new ryy.c(str, leadForm.e, leadForm.f, e43.l(new ImageSize(mainImage.b, 1080, IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, null, (char) 0, false, 56, null), new ImageSize(mainImage.c, 480, atv0.b, null, (char) 0, false, 56, null), new ImageSize(mainImage.d, 320, 180, null, (char) 0, false, 56, null))));
            for (ShitAttachment.LeadForm.LeadFormBlock leadFormBlock : leadForm.j) {
                ShitAttachment.LeadForm.LeadFormBlock.Type type = leadFormBlock.d;
                List<ShitAttachment.LeadForm.LeadFormBlock.Answer> list2 = leadFormBlock.e;
                String str2 = leadFormBlock.b;
                String str3 = leadFormBlock.c;
                int i = syy.a.$EnumSwitchMapping$0[type.ordinal()];
                if (i == 1) {
                    arrayList.add(new ryy.a.C3642a(str, str3, str2, leadForm.m, list2));
                } else if (i == 2) {
                    arrayList.add(new ryy.a.b(str, str3, str2, leadForm.m, list2));
                } else if (i == 3) {
                    arrayList.add(new ryy.a.c(str, str3, str2, leadForm.m));
                }
            }
            if (!list.isEmpty()) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                arrayList.add(new ryy.b(str, context.getString(R.string.lead_ads_contacts_title), list, leadForm.l));
            }
            ShitAttachment.LeadForm.ResultInfo resultInfo = leadForm.i;
            arrayList.add(new ryy.d(str, resultInfo.b, resultInfo.c, resultInfo.d, resultInfo.e, resultInfo.f, resultInfo.g, resultInfo.h));
            this.I = arrayList.size();
            iyy iyyVar = this.G;
            ArrayList arrayList2 = iyyVar.g;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            iyyVar.notifyDataSetChanged();
        }
    }

    public final void U6() {
        DeprecatedStatisticInterface.a aVar;
        ShitAttachment q6 = q6();
        if (q6 == null || (aVar = q6.S) == null) {
            return;
        }
        Iterator it = aVar.b("click").iterator();
        while (it.hasNext()) {
            com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
        }
    }

    public final void W6(ShitAttachment.LeadForm leadForm) {
        String str = leadForm.c;
        tyy tyyVar = this.E;
        int j = tyyVar.j(str);
        if (j < this.I - 1) {
            int i = j + 1;
            this.F.scrollToPosition(i);
            tyyVar.c(i, str);
            U6();
        }
    }
}
