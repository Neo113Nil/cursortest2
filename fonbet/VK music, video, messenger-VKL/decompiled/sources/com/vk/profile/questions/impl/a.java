package com.vk.profile.questions.impl;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.VkTopBar$Middle$Cell$Middle$Text;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a470;
import xsna.b8g;
import xsna.baf0;
import xsna.cn70;
import xsna.dhr0;
import xsna.dqa;
import xsna.dw20;
import xsna.e3m;
import xsna.e60;
import xsna.epx;
import xsna.ey0;
import xsna.hi6;
import xsna.ht;
import xsna.iah0;
import xsna.jjc;
import xsna.js5;
import xsna.jv2;
import xsna.jy;
import xsna.kv2;
import xsna.lv2;
import xsna.mhy;
import xsna.mjr;
import xsna.mpe0;
import xsna.msy;
import xsna.o25;
import xsna.snx;
import xsna.tlo0;
import xsna.tq;
import xsna.vlw;

/* compiled from: AnswerQuestionDialog.kt */
/* loaded from: classes5.dex */
public final class a extends hi6<Object> {
    public static final /* synthetic */ int o1 = 0;
    public UsersUserFullDto g1;
    public QuestionsQuestionDto h1;
    public AnswerSource i1;
    public mjr j1;
    public VkButton k1;
    public View l1;
    public VkInputSelect m1;
    public final Object n1 = msy.a(LazyThreadSafetyMode.NONE, new ey0(this, 1));

    /* compiled from: AnswerQuestionDialog.kt */
    /* renamed from: com.vk.profile.questions.impl.a$a, reason: collision with other inner class name */
    public static final class C1671a extends dw20.b {
        public final UsersUserFullDto e;
        public final QuestionsQuestionDto f;
        public final AnswerSource g;

        public C1671a(Context context, UsersUserFullDto usersUserFullDto, QuestionsQuestionDto questionsQuestionDto, AnswerSource answerSource) {
            super(context, null);
            this.e = usersUserFullDto;
            this.f = questionsQuestionDto;
            this.g = answerSource;
            c(new a470());
            F0(true);
            G0();
            l(dhr0.t.c(R.attr.vk_ui_background_content));
            x(iah0.a(12));
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.g1 = this.e;
            aVar.h1 = this.f;
            aVar.i1 = this.g;
            return aVar;
        }
    }

    @Override // xsna.hi6
    public final Object Yn() {
        return this.j1;
    }

    public final void Zn(boolean z) {
        VkButton vkButton = this.k1;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setEnabled(z);
    }

    public final void ao(boolean z) {
        int i = z ? R.string.questions_action_answer_add_to_story : R.string.questions_action_answer_to_message;
        baf0 b = dhr0.t.b(z ? R.drawable.vk_icon_story_outline_24 : R.drawable.vk_icon_message_outline_24, R.attr.colorPrimary);
        b.setBounds(0, 0, cn70.f(24), cn70.f(24));
        dqa dqaVar = new dqa(b);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable("   " + requireContext().getString(i));
        newSpannable.setSpan(dqaVar, 0, 1, 0);
        VkButton vkButton = this.k1;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setText(newSpannable);
        Zn(true);
        jjc.g(vkButton, new lv2(this, z, 0));
    }

    public final void bo(SchemeStat$TypeQuestionItem.Type type) {
        UsersUserFullDto usersUserFullDto = this.g1;
        if (usersUserFullDto == null) {
            usersUserFullDto = null;
        }
        UserId s1 = usersUserFullDto.s1();
        UserId c = o25.a().c();
        QuestionsQuestionDto questionsQuestionDto = this.h1;
        if (questionsQuestionDto == null) {
            questionsQuestionDto = null;
        }
        Integer valueOf = Integer.valueOf(questionsQuestionDto.getId());
        VkInputSelect vkInputSelect = this.m1;
        mpe0.b(type, s1, c, valueOf, String.valueOf((vkInputSelect != null ? vkInputSelect : null).getText()), null, 32);
    }

    @Override // xsna.hi6, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mjr mjrVar = this.j1;
        if (mjrVar != null) {
            io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) mjrVar.d;
            if (cVar != null) {
                cVar.dispose();
            }
            mjrVar.d = null;
        }
    }

    @Override // xsna.hi6, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        String string;
        if (this.g1 == null || this.h1 == null) {
            tn();
            return super.yn(bundle);
        }
        View inflate = LayoutInflater.from(Mn()).inflate(R.layout.answer_question_dialog, (ViewGroup) null, false);
        dw20.Rn(this, inflate, 4);
        this.j1 = new mjr(this);
        Context context = inflate.getContext();
        QuestionsQuestionDto questionsQuestionDto = this.h1;
        if (questionsQuestionDto == null) {
            questionsQuestionDto = null;
        }
        if (epx.f(questionsQuestionDto.j(), Boolean.TRUE)) {
            string = context.getString(R.string.answer_question_from_anonym);
        } else {
            StringBuilder sb = new StringBuilder();
            UsersUserFullDto usersUserFullDto = this.g1;
            if (usersUserFullDto == null) {
                usersUserFullDto = null;
            }
            sb.append(usersUserFullDto.D0());
            sb.append(' ');
            UsersUserFullDto usersUserFullDto2 = this.g1;
            if (usersUserFullDto2 == null) {
                usersUserFullDto2 = null;
            }
            sb.append(usersUserFullDto2.x1());
            string = context.getString(R.string.answer_question_from_person, sb.toString());
        }
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.close), new com.vk.movika.sdk.base.logic.processor.h(this, 3), new b8g(e3m.f(R.attr.vk_ui_icon_accent, context)), com.vk.core.compose.component.semantics.b.a(null, new ht(4), 3)));
        UsersUserFullDto usersUserFullDto3 = this.g1;
        if (usersUserFullDto3 == null) {
            usersUserFullDto3 = null;
        }
        String a = js5.a(iah0.a(24), usersUserFullDto3.r2());
        if (a == null) {
            UsersUserFullDto usersUserFullDto4 = this.g1;
            if (usersUserFullDto4 == null) {
                usersUserFullDto4 = null;
            }
            a = usersUserFullDto4.o2();
            if (a == null) {
                a = "";
            }
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.a(new com.vk.core.view.components.topbar.b(new snx(new snx.b.c(new vlw(a, null), null, null, 14)), com.vk.core.compose.component.semantics.b.a(null, new e60(4), 3), 2), new VkTopBar$Middle$Cell$Middle$Text(new VkTopBar$Middle$Cell$Middle$Text.Title(new tlo0.h(string), null, com.vk.core.compose.component.semantics.b.a(null, new jv2(string, 0), 3), 30), null, 6)));
        TextView textView = (TextView) inflate.findViewById(R.id.answer_question_tv_text);
        QuestionsQuestionDto questionsQuestionDto2 = this.h1;
        if (questionsQuestionDto2 == null) {
            questionsQuestionDto2 = null;
        }
        textView.setText(questionsQuestionDto2.f());
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.answer_question_et_answer);
        vkInputSelect.postDelayed(new kv2(vkInputSelect, 0), 200L);
        this.m1 = vkInputSelect;
        vkInputSelect.c(new jy(this, 3));
        VkInputSelect vkInputSelect2 = this.m1;
        if (vkInputSelect2 == null) {
            vkInputSelect2 = null;
        }
        vkInputSelect2.setMaxLinesNumber(3);
        this.k1 = (VkButton) inflate.findViewById(R.id.answer_question_tv_progress_next);
        AnswerSource answerSource = this.i1;
        if (answerSource == null) {
            answerSource = null;
        }
        ao(answerSource == AnswerSource.STORY_REPLY);
        this.l1 = inflate.findViewById(R.id.answer_question_tv_error);
        VkInputSelect vkInputSelect3 = this.m1;
        if (vkInputSelect3 == null) {
            vkInputSelect3 = null;
        }
        vkInputSelect3.requestFocus();
        VkInputSelect vkInputSelect4 = this.m1;
        mhy.j(vkInputSelect4 != null ? vkInputSelect4 : null);
        return super.yn(bundle);
    }
}
