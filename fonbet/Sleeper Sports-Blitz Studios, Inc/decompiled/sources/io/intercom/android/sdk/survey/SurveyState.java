package io.intercom.android.sdk.survey;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState;", "", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "Lio/intercom/android/sdk/survey/SurveyState$Initial;", "Lio/intercom/android/sdk/survey/SurveyState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class SurveyState {
    public static final int $stable = 0;

    public /* synthetic */ SurveyState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState getTopBarState();

    private SurveyState() {
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Initial;", "Lio/intercom/android/sdk/survey/SurveyState;", "<init>", "()V", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Initial extends SurveyState {
        public static final int $stable = 0;
        public static final Initial INSTANCE;
        private static final SurveyUiColors surveyUiColors;
        private static final TopBarState topBarState;

        private Initial() {
            super(null);
        }

        static {
            Initial initial = new Initial();
            INSTANCE = initial;
            surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null));
            topBarState = new TopBarState.NoTopBarState(true, initial.getSurveyUiColors(), null, 4, null);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return topBarState;
        }
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Loading;", "Lio/intercom/android/sdk/survey/SurveyState;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends SurveyState {
        public static final int $stable = 0;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        public static /* synthetic */ Loading copy$default(Loading loading, SurveyUiColors surveyUiColors, TopBarState topBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                surveyUiColors = loading.surveyUiColors;
            }
            if ((i & 2) != 0) {
                topBarState = loading.topBarState;
            }
            return loading.copy(surveyUiColors, topBarState);
        }

        /* renamed from: component1, reason: from getter */
        public final SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        /* renamed from: component2, reason: from getter */
        public final TopBarState getTopBarState() {
            return this.topBarState;
        }

        public final Loading copy(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            return new Loading(surveyUiColors, topBarState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.surveyUiColors, loading.surveyUiColors) && Intrinsics.areEqual(this.topBarState, loading.topBarState);
        }

        public int hashCode() {
            return (this.surveyUiColors.hashCode() * 31) + this.topBarState.hashCode();
        }

        public String toString() {
            return "Loading(surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error;", "Lio/intercom/android/sdk/survey/SurveyState;", "<init>", "()V", "messageResId", "", "getMessageResId", "()I", "WithCTA", "WithoutCTA", "Lio/intercom/android/sdk/survey/SurveyState$Error$WithCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error$WithoutCTA;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends SurveyState {
        public static final int $stable = 0;

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getMessageResId();

        private Error() {
            super(null);
        }

        /* compiled from: SurveyViewModel.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error$WithCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "messageResId", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "<init>", "(ILio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;Lkotlin/jvm/functions/Function0;)V", "getMessageResId", "()I", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WithCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final Function0<Unit> onClick;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            public /* synthetic */ WithCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i, surveyUiColors, topBarState, function0);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            public final Function0<Unit> getOnClick() {
                return this.onClick;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, Function0<Unit> onClick) {
                super(null);
                Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
                Intrinsics.checkNotNullParameter(topBarState, "topBarState");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                this.messageResId = i;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
                this.onClick = onClick;
            }
        }

        /* compiled from: SurveyViewModel.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error$WithoutCTA;", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "messageResId", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(ILio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getMessageResId", "()I", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WithoutCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            public /* synthetic */ WithoutCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i, surveyUiColors, topBarState);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState) {
                super(null);
                Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
                Intrinsics.checkNotNullParameter(topBarState, "topBarState");
                this.messageResId = i;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
            }
        }
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u000eHÆ\u0003JW\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020)H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content;", "Lio/intercom/android/sdk/survey/SurveyState;", "stepTitle", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "questions", "Lio/intercom/android/sdk/survey/QuestionState;", "secondaryCtaActions", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "primaryCta", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;Lio/intercom/android/sdk/survey/SurveyUiColors;Lio/intercom/android/sdk/survey/TopBarState;)V", "getStepTitle", "()Ljava/util/List;", "getQuestions", "getSecondaryCtaActions", "getPrimaryCta", "()Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "getSurveyUiColors", "()Lio/intercom/android/sdk/survey/SurveyUiColors;", "getTopBarState", "()Lio/intercom/android/sdk/survey/TopBarState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "SecondaryCta", "PrimaryCta", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content extends SurveyState {
        public static final int $stable = 8;
        private final PrimaryCta primaryCta;
        private final List<QuestionState> questions;
        private final List<SecondaryCta> secondaryCtaActions;
        private final List<Block.Builder> stepTitle;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        public static /* synthetic */ Content copy$default(Content content, List list, List list2, List list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                list = content.stepTitle;
            }
            if ((i & 2) != 0) {
                list2 = content.questions;
            }
            if ((i & 4) != 0) {
                list3 = content.secondaryCtaActions;
            }
            if ((i & 8) != 0) {
                primaryCta = content.primaryCta;
            }
            if ((i & 16) != 0) {
                surveyUiColors = content.surveyUiColors;
            }
            if ((i & 32) != 0) {
                topBarState = content.topBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            TopBarState topBarState2 = topBarState;
            return content.copy(list, list2, list3, primaryCta, surveyUiColors2, topBarState2);
        }

        public final List<Block.Builder> component1() {
            return this.stepTitle;
        }

        public final List<QuestionState> component2() {
            return this.questions;
        }

        public final List<SecondaryCta> component3() {
            return this.secondaryCtaActions;
        }

        /* renamed from: component4, reason: from getter */
        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        /* renamed from: component5, reason: from getter */
        public final SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        /* renamed from: component6, reason: from getter */
        public final TopBarState getTopBarState() {
            return this.topBarState;
        }

        public final Content copy(List<Block.Builder> stepTitle, List<QuestionState> questions, List<SecondaryCta> secondaryCtaActions, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(stepTitle, "stepTitle");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(secondaryCtaActions, "secondaryCtaActions");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            return new Content(stepTitle, questions, secondaryCtaActions, primaryCta, surveyUiColors, topBarState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.stepTitle, content.stepTitle) && Intrinsics.areEqual(this.questions, content.questions) && Intrinsics.areEqual(this.secondaryCtaActions, content.secondaryCtaActions) && Intrinsics.areEqual(this.primaryCta, content.primaryCta) && Intrinsics.areEqual(this.surveyUiColors, content.surveyUiColors) && Intrinsics.areEqual(this.topBarState, content.topBarState);
        }

        public int hashCode() {
            return (((((((((this.stepTitle.hashCode() * 31) + this.questions.hashCode()) * 31) + this.secondaryCtaActions.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.surveyUiColors.hashCode()) * 31) + this.topBarState.hashCode();
        }

        public String toString() {
            return "Content(stepTitle=" + this.stepTitle + ", questions=" + this.questions + ", secondaryCtaActions=" + this.secondaryCtaActions + ", primaryCta=" + this.primaryCta + ", surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }

        public final List<Block.Builder> getStepTitle() {
            return this.stepTitle;
        }

        public final List<QuestionState> getQuestions() {
            return this.questions;
        }

        public final List<SecondaryCta> getSecondaryCtaActions() {
            return this.secondaryCtaActions;
        }

        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        /* compiled from: SurveyViewModel.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "", "buttonText", "", "destination", "isExternalUrl", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getButtonText", "()Ljava/lang/String;", "getDestination", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SecondaryCta {
            public static final int $stable = 0;
            private final String buttonText;
            private final String destination;
            private final boolean isExternalUrl;

            public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = secondaryCta.buttonText;
                }
                if ((i & 2) != 0) {
                    str2 = secondaryCta.destination;
                }
                if ((i & 4) != 0) {
                    z = secondaryCta.isExternalUrl;
                }
                return secondaryCta.copy(str, str2, z);
            }

            /* renamed from: component1, reason: from getter */
            public final String getButtonText() {
                return this.buttonText;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDestination() {
                return this.destination;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsExternalUrl() {
                return this.isExternalUrl;
            }

            public final SecondaryCta copy(String buttonText, String destination, boolean isExternalUrl) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(destination, "destination");
                return new SecondaryCta(buttonText, destination, isExternalUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SecondaryCta)) {
                    return false;
                }
                SecondaryCta secondaryCta = (SecondaryCta) other;
                return Intrinsics.areEqual(this.buttonText, secondaryCta.buttonText) && Intrinsics.areEqual(this.destination, secondaryCta.destination) && this.isExternalUrl == secondaryCta.isExternalUrl;
            }

            public int hashCode() {
                return (((this.buttonText.hashCode() * 31) + this.destination.hashCode()) * 31) + Boolean.hashCode(this.isExternalUrl);
            }

            public String toString() {
                return "SecondaryCta(buttonText=" + this.buttonText + ", destination=" + this.destination + ", isExternalUrl=" + this.isExternalUrl + ')';
            }

            public SecondaryCta(String buttonText, String destination, boolean z) {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(destination, "destination");
                this.buttonText = buttonText;
                this.destination = destination;
                this.isExternalUrl = z;
            }

            public final String getButtonText() {
                return this.buttonText;
            }

            public final String getDestination() {
                return this.destination;
            }

            public final boolean isExternalUrl() {
                return this.isExternalUrl;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(List<Block.Builder> stepTitle, List<QuestionState> questions, List<SecondaryCta> secondaryCtaActions, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            Intrinsics.checkNotNullParameter(stepTitle, "stepTitle");
            Intrinsics.checkNotNullParameter(questions, "questions");
            Intrinsics.checkNotNullParameter(secondaryCtaActions, "secondaryCtaActions");
            Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
            Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            this.stepTitle = stepTitle;
            this.questions = questions;
            this.secondaryCtaActions = secondaryCtaActions;
            this.primaryCta = primaryCta;
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        /* compiled from: SurveyViewModel.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "", "<init>", "()V", "Fallback", TypedValues.Custom.NAME, "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Custom;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Fallback;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class PrimaryCta {
            public static final int $stable = 0;

            public /* synthetic */ PrimaryCta(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: SurveyViewModel.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Fallback;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "fallbackTextRes", "", "<init>", "(I)V", "getFallbackTextRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Fallback extends PrimaryCta {
                public static final int $stable = 0;
                private final int fallbackTextRes;

                public static /* synthetic */ Fallback copy$default(Fallback fallback, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = fallback.fallbackTextRes;
                    }
                    return fallback.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }

                public final Fallback copy(int fallbackTextRes) {
                    return new Fallback(fallbackTextRes);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Fallback) && this.fallbackTextRes == ((Fallback) other).fallbackTextRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.fallbackTextRes);
                }

                public String toString() {
                    return "Fallback(fallbackTextRes=" + this.fallbackTextRes + ')';
                }

                public Fallback(int i) {
                    super(null);
                    this.fallbackTextRes = i;
                }

                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }
            }

            private PrimaryCta() {
            }

            /* compiled from: SurveyViewModel.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta$Custom;", "Lio/intercom/android/sdk/survey/SurveyState$Content$PrimaryCta;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Custom extends PrimaryCta {
                public static final int $stable = 0;
                private final String text;

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = custom.text;
                    }
                    return custom.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                public final Custom copy(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Custom(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Custom) && Intrinsics.areEqual(this.text, ((Custom) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "Custom(text=" + this.text + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String text) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public final String getText() {
                    return this.text;
                }
            }
        }
    }
}
