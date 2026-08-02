package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.UsersResponse;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.model.SurveyData;

/* loaded from: classes9.dex */
public class UpdateUserResponse extends UsersResponse {
    private final String botBehaviourId;
    private final BotIntro botIntro;
    private final Carousel carousel;
    private final SurveyData surveyData;
    private final TeamPresence teamPresence;

    UpdateUserResponse(Builder builder) {
        super(builder);
        this.teamPresence = builder.team_presence == null ? TeamPresence.NULL : builder.team_presence;
        this.carousel = (builder.carousel == null ? new Carousel.Builder() : builder.carousel).build();
        this.botIntro = builder.bot_intro == null ? BotIntro.NULL : builder.bot_intro;
        this.surveyData = builder.survey == null ? SurveyData.INSTANCE.getNULL() : builder.survey;
        this.botBehaviourId = builder.resolution_bot_behavior_version_id;
    }

    public TeamPresence getTeamPresence() {
        return this.teamPresence;
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public BotIntro getBotIntro() {
        return this.botIntro;
    }

    public SurveyData getSurveyData() {
        return this.surveyData;
    }

    public String getBotBehaviourId() {
        return this.botBehaviourId;
    }

    public static final class Builder extends UsersResponse.Builder {
        BotIntro bot_intro;
        Carousel.Builder carousel;
        String resolution_bot_behavior_version_id;
        SurveyData survey;
        TeamPresence team_presence;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public UpdateUserResponse build() {
            return new UpdateUserResponse(this);
        }
    }
}
