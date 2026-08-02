package ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.presentation;

import C.o0;
import Cm.e;
import F3.G;
import G.g;
import Lh.b;
import T7.Z;
import Xc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.BloggerPersonalDataFormInputState;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI;", "Ll20/c;", "Content", "Overlay", "View", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BloggerPersonalDataFormVI extends c {

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Content;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI;", "", "id", "", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "views", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getViews", "()Ljava/util/List;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements BloggerPersonalDataFormVI {
        private final long id;

        @NotNull
        private final List<View> views;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(long j11, @NotNull List<? extends View> views) {
            Intrinsics.checkNotNullParameter(views, "views");
            this.id = j11;
            this.views = views;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return this.id == content.id && Intrinsics.d(this.views, content.views);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @NotNull
        public final List<View> getViews() {
            return this.views;
        }

        public int hashCode() {
            return this.views.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = b.b(this.id, "Content(id=", ", views=", this.views);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull BloggerPersonalDataFormVI bloggerPersonalDataFormVI) {
            return null;
        }

        public static int getViewItemKey(@NotNull BloggerPersonalDataFormVI bloggerPersonalDataFormVI) {
            return bloggerPersonalDataFormVI.hashCode();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$Overlay;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Overlay implements BloggerPersonalDataFormVI {
        private final long id;

        @NotNull
        private final ButtonV3DTO submitButton;

        public Overlay(long j11, @NotNull ButtonV3DTO submitButton) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.id = j11;
            this.submitButton = submitButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Overlay)) {
                return false;
            }
            Overlay overlay = (Overlay) other;
            return this.id == overlay.id && Intrinsics.d(this.submitButton, overlay.submitButton);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.submitButton.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = G.c("Overlay(id=", this.id, ", submitButton=", this.submitButton);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "", "Input", "Separator", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface View {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\r¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input$Type;", "type", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "initialState", HammersV3BodyDTO.PLACEHOLDER, "automatizationId", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input$Type;Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input$Type;", "getType", "()Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input$Type;", "Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "getInitialState", "()Lru/ozon/app/android/actionHandlers/monetization/submitBloggerPersonalData/BloggerPersonalDataFormInputState;", "getPlaceholder", "getAutomatizationId", "Type", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Input implements View {
            private final String automatizationId;

            @NotNull
            private final BloggerPersonalDataFormInputState initialState;

            @NotNull
            private final String name;

            @NotNull
            private final String placeholder;

            @NotNull
            private final Type type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Input$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ADDRESS", "TEXT", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type ADDRESS = new Type("ADDRESS", 0);
                public static final Type TEXT = new Type("TEXT", 1);

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{ADDRESS, TEXT};
                }

                static {
                    Type[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private Type(String str, int i11) {
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public Input(@NotNull String name, @NotNull Type type, @NotNull BloggerPersonalDataFormInputState initialState, @NotNull String placeholder, String str) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(initialState, "initialState");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.name = name;
                this.type = type;
                this.initialState = initialState;
                this.placeholder = placeholder;
                this.automatizationId = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return Intrinsics.d(this.name, input.name) && this.type == input.type && Intrinsics.d(this.initialState, input.initialState) && Intrinsics.d(this.placeholder, input.placeholder) && Intrinsics.d(this.automatizationId, input.automatizationId);
            }

            public final String getAutomatizationId() {
                return this.automatizationId;
            }

            @NotNull
            public final BloggerPersonalDataFormInputState getInitialState() {
                return this.initialState;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                int a11 = g.a((this.initialState.hashCode() + ((this.type.hashCode() + (this.name.hashCode() * 31)) * 31)) * 31, 31, this.placeholder);
                String str = this.automatizationId;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.name;
                Type type = this.type;
                BloggerPersonalDataFormInputState bloggerPersonalDataFormInputState = this.initialState;
                String str2 = this.placeholder;
                String str3 = this.automatizationId;
                StringBuilder sb2 = new StringBuilder("Input(name=");
                sb2.append(str);
                sb2.append(", type=");
                sb2.append(type);
                sb2.append(", initialState=");
                sb2.append(bloggerPersonalDataFormInputState);
                sb2.append(", placeholder=");
                sb2.append(str2);
                sb2.append(", automatizationId=");
                return o0.c(sb2, str3, ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View$Separator;", "Lru/ozon/app/android/monetization/widgets/bloggerPersonalDataForm/presentation/BloggerPersonalDataFormVI$View;", "", "height", "", "tintColor", "leftPadding", "rightPadding", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "Ljava/lang/String;", "getTintColor", "Ljava/lang/Integer;", "getLeftPadding", "()Ljava/lang/Integer;", "getRightPadding", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator implements View {
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
}
