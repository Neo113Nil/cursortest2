package com.vk.profile.questions.impl;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.profile.questions.impl.d;
import kotlin.Triple;
import xsna.epx;

/* compiled from: QuestionMapper.kt */
/* loaded from: classes5.dex */
public final class c {
    public static d.c a(QuestionsQuestionDto questionsQuestionDto, UsersUserFullDto usersUserFullDto) {
        Boolean k = questionsQuestionDto.k();
        Boolean bool = Boolean.TRUE;
        boolean f = epx.f(k, bool);
        boolean f2 = epx.f(questionsQuestionDto.j(), bool);
        Integer d = questionsQuestionDto.d();
        Triple triple = new Triple(Boolean.valueOf((d != null ? d.intValue() : 0) > 0), Boolean.valueOf(questionsQuestionDto.e() != null), Boolean.valueOf(usersUserFullDto.D() == BaseBoolIntDto.YES));
        boolean booleanValue = ((Boolean) triple.d()).booleanValue();
        boolean booleanValue2 = ((Boolean) triple.g()).booleanValue();
        boolean booleanValue3 = ((Boolean) triple.h()).booleanValue();
        return new d.c(questionsQuestionDto, usersUserFullDto, f, f2, booleanValue, booleanValue2, (booleanValue || booleanValue2) ? !booleanValue && booleanValue3 : booleanValue3);
    }
}
