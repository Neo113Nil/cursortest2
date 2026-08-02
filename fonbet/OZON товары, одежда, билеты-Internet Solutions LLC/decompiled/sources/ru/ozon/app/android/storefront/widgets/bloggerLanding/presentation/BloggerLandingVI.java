package ru.ozon.app.android.storefront.widgets.bloggerLanding.presentation;

import Ak.C2436a;
import De.C2859b;
import G.g;
import Nh.a;
import Ns.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.bloggerLanding.data.LandingCell;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/storefront/widgets/bloggerLanding/presentation/BloggerLandingVI;", "Ll20/c;", "", "id", "", "backgroundImage", "accentImage", "", "Lru/ozon/app/android/storefront/widgets/bloggerLanding/data/LandingCell;", "cells", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "actionButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "getAccentImage", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BloggerLandingVI implements c {

    @NotNull
    private final String accentImage;

    @NotNull
    private final ButtonV3DTO actionButton;

    @NotNull
    private final String backgroundImage;

    @NotNull
    private final List<LandingCell> cells;
    private final long id;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    public BloggerLandingVI(long j11, @NotNull String backgroundImage, @NotNull String accentImage, @NotNull List<LandingCell> cells, @NotNull TextDTO title, @NotNull ButtonV3DTO actionButton, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(accentImage, "accentImage");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.id = j11;
        this.backgroundImage = backgroundImage;
        this.accentImage = accentImage;
        this.cells = cells;
        this.title = title;
        this.actionButton = actionButton;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloggerLandingVI)) {
            return false;
        }
        BloggerLandingVI bloggerLandingVI = (BloggerLandingVI) other;
        return this.id == bloggerLandingVI.id && Intrinsics.d(this.backgroundImage, bloggerLandingVI.backgroundImage) && Intrinsics.d(this.accentImage, bloggerLandingVI.accentImage) && Intrinsics.d(this.cells, bloggerLandingVI.cells) && Intrinsics.d(this.title, bloggerLandingVI.title) && Intrinsics.d(this.actionButton, bloggerLandingVI.actionButton) && Intrinsics.d(this.tokenizedEvent, bloggerLandingVI.tokenizedEvent);
    }

    @NotNull
    public final String getAccentImage() {
        return this.accentImage;
    }

    @NotNull
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final List<LandingCell> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.actionButton, b.a(this.title, g.b(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.backgroundImage), 31, this.accentImage), 31, this.cells), 31), 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundImage;
        String str2 = this.accentImage;
        List<LandingCell> list = this.cells;
        TextDTO textDTO = this.title;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "BloggerLandingVI(id=", ", backgroundImage=", str);
        a.g(", accentImage=", str2, ", cells=", c11, list);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", actionButton=");
        c11.append(buttonV3DTO);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
