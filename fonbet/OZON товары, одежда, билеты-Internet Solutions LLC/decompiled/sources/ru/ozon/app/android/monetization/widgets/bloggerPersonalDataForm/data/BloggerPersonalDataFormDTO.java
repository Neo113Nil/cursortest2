package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.data;

import Cm.e;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import T7.Z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO;", "", "views", "", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getViews", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "View", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BloggerPersonalDataFormDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final List<View> views;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;", "", "Input", "Separator", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Separator;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface View {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "emptyError", "isOptional", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/TestInfo;)V", "getName", "()Ljava/lang/String;", "getValue", "getPlaceholder", "getEmptyError", "()Z", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Input implements View {
            public static final int $stable = TestInfo.$stable;
            private final String emptyError;
            private final boolean isOptional;

            @NotNull
            private final String name;

            @NotNull
            private final String placeholder;
            private final TestInfo testInfo;
            private final String value;

            public Input(@NotNull String name, String str, @NotNull String placeholder, String str2, boolean z11, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.name = name;
                this.value = str;
                this.placeholder = placeholder;
                this.emptyError = str2;
                this.isOptional = z11;
                this.testInfo = testInfo;
            }

            public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, String str4, boolean z11, TestInfo testInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = input.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = input.value;
                }
                if ((i11 & 4) != 0) {
                    str3 = input.placeholder;
                }
                if ((i11 & 8) != 0) {
                    str4 = input.emptyError;
                }
                if ((i11 & 16) != 0) {
                    z11 = input.isOptional;
                }
                if ((i11 & 32) != 0) {
                    testInfo = input.testInfo;
                }
                boolean z12 = z11;
                TestInfo testInfo2 = testInfo;
                return input.copy(str, str2, str3, str4, z12, testInfo2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component4, reason: from getter */
            public final String getEmptyError() {
                return this.emptyError;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsOptional() {
                return this.isOptional;
            }

            /* renamed from: component6, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final Input copy(@NotNull String name, String value, @NotNull String placeholder, String emptyError, boolean isOptional, TestInfo testInfo) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                return new Input(name, value, placeholder, emptyError, isOptional, testInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return Intrinsics.d(this.name, input.name) && Intrinsics.d(this.value, input.value) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.emptyError, input.emptyError) && this.isOptional == input.isOptional && Intrinsics.d(this.testInfo, input.testInfo);
            }

            public final String getEmptyError() {
                return this.emptyError;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.value;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.placeholder);
                String str2 = this.emptyError;
                int a12 = C3532b.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isOptional);
                TestInfo testInfo = this.testInfo;
                return a12 + (testInfo != null ? testInfo.hashCode() : 0);
            }

            public final boolean isOptional() {
                return this.isOptional;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.value;
                String str3 = this.placeholder;
                String str4 = this.emptyError;
                boolean z11 = this.isOptional;
                TestInfo testInfo = this.testInfo;
                StringBuilder d11 = C3660k.d("Input(name=", str, ", value=", str2, ", placeholder=");
                a.h(d11, str3, ", emptyError=", str4, ", isOptional=");
                d11.append(z11);
                d11.append(", testInfo=");
                d11.append(testInfo);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Separator;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View;", "height", "", "tintColor", "", "leftPadding", "rightPadding", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()I", "getTintColor", "()Ljava/lang/String;", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/data/BloggerPersonalDataFormDTO$View$Separator;", "equals", "", "other", "", "hashCode", "toString", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator implements View {
            public static final int $stable = 0;
            private final int height;
            private final Integer leftPadding;
            private final Integer rightPadding;
            private final String tintColor;

            public Separator(int i11, String str, Integer num, Integer num2) {
                this.height = i11;
                this.tintColor = str;
                this.leftPadding = num;
                this.rightPadding = num2;
            }

            public static /* synthetic */ Separator copy$default(Separator separator, int i11, String str, Integer num, Integer num2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = separator.height;
                }
                if ((i12 & 2) != 0) {
                    str = separator.tintColor;
                }
                if ((i12 & 4) != 0) {
                    num = separator.leftPadding;
                }
                if ((i12 & 8) != 0) {
                    num2 = separator.rightPadding;
                }
                return separator.copy(i11, str, num, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTintColor() {
                return this.tintColor;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getLeftPadding() {
                return this.leftPadding;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getRightPadding() {
                return this.rightPadding;
            }

            @NotNull
            public final Separator copy(int height, String tintColor, Integer leftPadding, Integer rightPadding) {
                return new Separator(height, tintColor, leftPadding, rightPadding);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Separator)) {
                    return false;
                }
                Separator separator = (Separator) other;
                return this.height == separator.height && Intrinsics.d(this.tintColor, separator.tintColor) && Intrinsics.d(this.leftPadding, separator.leftPadding) && Intrinsics.d(this.rightPadding, separator.rightPadding);
            }

            public final int getHeight() {
                return this.height;
            }

            public final Integer getLeftPadding() {
                return this.leftPadding;
            }

            public final Integer getRightPadding() {
                return this.rightPadding;
            }

            public final String getTintColor() {
                return this.tintColor;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.height) * 31;
                String str = this.tintColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.leftPadding;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.rightPadding;
                return hashCode3 + (num2 != null ? num2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.height;
                String str = this.tintColor;
                return Z.c(e.g(i11, "Separator(height=", ", tintColor=", str, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloggerPersonalDataFormDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "input", type = View.Input.class), @ProtoOneOfSignature(name = "separator", type = View.Separator.class)}) @NotNull @ProtoOneOf List<? extends View> views, @NotNull ButtonV3DTO submitButton) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.views = views;
        this.submitButton = submitButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloggerPersonalDataFormDTO copy$default(BloggerPersonalDataFormDTO bloggerPersonalDataFormDTO, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bloggerPersonalDataFormDTO.views;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = bloggerPersonalDataFormDTO.submitButton;
        }
        return bloggerPersonalDataFormDTO.copy(list, buttonV3DTO);
    }

    @NotNull
    public final List<View> component1() {
        return this.views;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final BloggerPersonalDataFormDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "input", type = View.Input.class), @ProtoOneOfSignature(name = "separator", type = View.Separator.class)}) @NotNull @ProtoOneOf List<? extends View> views, @NotNull ButtonV3DTO submitButton) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new BloggerPersonalDataFormDTO(views, submitButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloggerPersonalDataFormDTO)) {
            return false;
        }
        BloggerPersonalDataFormDTO bloggerPersonalDataFormDTO = (BloggerPersonalDataFormDTO) other;
        return Intrinsics.d(this.views, bloggerPersonalDataFormDTO.views) && Intrinsics.d(this.submitButton, bloggerPersonalDataFormDTO.submitButton);
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final List<View> getViews() {
        return this.views;
    }

    public int hashCode() {
        return this.submitButton.hashCode() + (this.views.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BloggerPersonalDataFormDTO(views=" + this.views + ", submitButton=" + this.submitButton + ")";
    }
}
