package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.p4g;

/* compiled from: UIBlockQuestionnaire.kt */
/* loaded from: classes16.dex */
public final class UIBlockQuestionnaire extends UIBlock {
    public static final Serializer.c<UIBlockQuestionnaire> CREATOR = new a();
    public final InternalNpsQuestions y;
    public final QuestionsTexts z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockQuestionnaire> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockQuestionnaire a(Serializer serializer) {
            return new UIBlockQuestionnaire(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockQuestionnaire[i];
        }
    }

    public UIBlockQuestionnaire(String str, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, InternalNpsQuestions internalNpsQuestions, QuestionsTexts questionsTexts) {
        super(str, CatalogViewType.SYNTHETIC_FEEDBACKS, CatalogDataType.DATA_TYPE_FEEDBACKS, str2, userId, list, set, uIBlockHint, null, null, null, null, null, null, null, 32512, null);
        this.y = internalNpsQuestions;
        this.z = questionsTexts;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.i0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockQuestionnaire) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockQuestionnaire uIBlockQuestionnaire = (UIBlockQuestionnaire) obj;
        return epx.f(this.y, uIBlockQuestionnaire.y) && epx.f(this.z, uIBlockQuestionnaire.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("VideoRecommend["), this.y.b, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        HashSet d = p4g.d(Db());
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        InternalNpsQuestions internalNpsQuestions = this.y;
        InternalNpsQuestions internalNpsQuestions2 = new InternalNpsQuestions(internalNpsQuestions.b, internalNpsQuestions.c, internalNpsQuestions.d);
        QuestionsTexts questionsTexts = this.z;
        return new UIBlockQuestionnaire(this.b, this.f, a2, a3, d, zb, internalNpsQuestions2, questionsTexts != null ? new QuestionsTexts(questionsTexts.b, questionsTexts.c, questionsTexts.d, questionsTexts.e) : null);
    }

    public UIBlockQuestionnaire(Serializer serializer) {
        super(serializer);
        this.y = (InternalNpsQuestions) serializer.G(InternalNpsQuestions.class.getClassLoader());
        this.z = (QuestionsTexts) serializer.G(QuestionsTexts.class.getClassLoader());
    }
}
